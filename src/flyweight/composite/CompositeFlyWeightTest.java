/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CompositeFlyWeightTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.composite;

import java.util.ArrayList;
import java.util.List;

import flyweight.simple.FlyWeight;

/**
 * 组合享元模式测试类
 * 
 * @author changhao
 */
public class CompositeFlyWeightTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("a");
    list.add("b");

    FlyWeightCompositeFactory factory = new FlyWeightCompositeFactory();
    // 组合享元对象1
    FlyWeight f1 = factory.factory(list);
    // 组合享元对象2
    FlyWeight f2 = factory.factory(list);

    f1.operation("Composite Call");
    System.out.println("=======");
    System.out.println("复合享元模式是否可以共享对象：" + (f1 == f2));

    String str = "a";
    FlyWeight f3 = factory.factory(str);
    FlyWeight f4 = factory.factory(str);
    System.out.println("单纯享元模式是否可以共享对象：" + (f3 == f4));

    System.out.println("f1.operation：");
    f1.operation(str);
    System.out.println("f2.operation：");
    f2.operation(str);
  }
}
