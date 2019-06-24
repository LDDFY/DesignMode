/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/15，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Car
 * 模块说明：
 * 修改历史：
 *  2019年-05月-15日  - changhao - 创建。
 */
package bridge;

/**
 * 具体的交通工具小轿车：ConcreteImplementor
 *
 * @author changhao
 */
public class Car implements Vehicle {
  @Override
  public void drive() {
    System.out.println("小轿车...\t\n");
  }
}
