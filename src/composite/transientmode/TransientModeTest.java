/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	TransientModeTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package composite.transientmode;

/**
 * 透明模式组合测试类
 *
 * @author changhao
 */
public class TransientModeTest {

  public static void main(String[] args) {
    Branches root = new Branches("树根");

    Branches branch01 = new Branches("树枝01");
    Branches branch02 = new Branches("树枝02");
    Branches branch03 = new Branches("树枝03");
    Branches branch04 = new Branches("树枝04");

    branch01.add(new Leaf("树叶01"));
    branch01.add(new Leaf("树叶02"));

    branch03.add(new Leaf("树叶03"));
    branch03.add(new Leaf("树叶04"));
    branch03.add(new Leaf("树叶05"));
    branch01.add(branch03);

    branch02.add(new Leaf("树叶06"));
    branch02.add(new Leaf("树叶07"));
    branch02.add(new Leaf("树叶08"));

    branch04.add(new Leaf("树叶09"));
    branch04.add(new Leaf("树叶10"));
    branch02.add(branch04);

    root.add(branch01);
    root.add(branch02);

    root.operation(0);
  }
}
