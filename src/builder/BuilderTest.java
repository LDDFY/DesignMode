/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	BuilderTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package builder;

/**
 * 建造者测试类
 *
 * @author changhao
 */
public class BuilderTest {
  public static void main(String[] args) {
    Director director = new Director();
    Plane product = director.construct(new ConcreteBuilder());
    System.out.println(product);
  }
}
