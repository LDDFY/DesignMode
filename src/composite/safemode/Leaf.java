/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Leaf
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.safemode;

import org.apache.commons.lang3.StringUtils;

/**
 * Leaf：叶子 相对于透明模式来讲叶子节点的remove、add、以及getChildren方法不在继承的组件之中。
 *
 * @author changhao
 */
public class Leaf extends Component {
  public Leaf(String name) {
    super(name);
  }

  @Override
  protected void operation(int depth) {
    System.out.println(StringUtils.repeat(SPLIT, depth).concat(this.name));
  }
}
