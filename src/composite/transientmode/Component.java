/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Component
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.transientmode;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 透明模式
 * <p>
 * 所有类共有接口的默认行为（树枝和叶子）
 *
 * @author changhao
 */
public abstract class Component {

	public static final String SPLIT = "->";

	/**
	 * 名称
	 */
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	/**
	 * 新建
	 *
	 * @param component 节点
	 */
	protected abstract void add(Component component);

	/**
	 * 删除
	 *
	 * @param component 节点
	 */
	protected abstract void remove(Component component);

	/**
	 * 操作
	 *
	 * @param depth 节点深度
	 */
	protected abstract void operation(int depth);

	/**
	 * 获取子类
	 *
	 * @return 节点列表
	 */
	protected abstract List<Component> getChildren();


  protected void printSplit(int repeat) {
    System.out.print(StringUtils.repeat(SPLIT, repeat));
    System.out.println(this.name);
  }
}
