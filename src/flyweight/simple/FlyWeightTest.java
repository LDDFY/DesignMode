/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	FlyWeightTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.simple;

/**
 * 享元模式测试类
 * 
 * @author changhao
 */
public class FlyWeightTest {
  public static void main(String[] args) {
    FlyWeightFactory factory = new FlyWeightFactory();
    FlyWeight f1 = factory.factory("a");
    FlyWeight f2 = factory.factory("b");
    FlyWeight f3 = factory.factory("a");

    f1.operation("a fly weight");
    f2.operation("b fly weight");
    f3.operation("c fly weight");

    System.out.println(f1 == f3);
    System.out.println(factory.size());
  }
}
