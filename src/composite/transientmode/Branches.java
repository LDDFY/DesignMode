/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Composite
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.transientmode;

import java.util.LinkedList;
import java.util.List;

/**
 * 树枝 Branches,树枝可添加树枝和树叶
 *
 * @author changhao
 */
public class Branches extends Component {

	/**
	 * 子树枝/叶子信息
	 */
	private final LinkedList<Component> children;

	public Branches(String name) {
		super(name);
		this.children = new LinkedList<>();
	}

	@Override
	protected void add(Component component) {
		this.children.add(component);
	}

	@Override
	protected void remove(Component component) {
		this.children.remove(component);
	}

	@Override
	protected void operation(int depth) {
		super.printSplit(depth);
		int childDepth = depth + 1;
		for (Component c : this.getChildren()) {
			c.operation(childDepth);
		}
	}

	@Override
	protected List<Component> getChildren() {
		return this.children;
	}
}
