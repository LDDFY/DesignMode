/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Composite
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.safemode;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 安全模式树枝
 *
 * @author changhao
 */
public class Composite extends Component {
  /**
   * 子树枝/叶子信息
   */
  private LinkedList<Component> children;

  public Composite(String name) {
    super(name);
    this.children = new LinkedList<>();
  }

  protected void add(Component component) {
    this.children.add(component);
  }

  protected void remove(composite.transientmode.Component component) {
    this.children.remove(component);
  }

  @Override
  protected void operation(int depth) {
    System.out.println(StringUtils.repeat(SPLIT, depth).concat(this.name));
    int childDepth = depth + 1;
    for (Component c : this.getChildren()) {
      c.operation(childDepth);
    }
  }

  protected List<Component> getChildren() {
    return this.children;
  }
}
