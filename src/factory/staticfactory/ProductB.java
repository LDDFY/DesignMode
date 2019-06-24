/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ProductB
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package factory.staticfactory;

/**
 * 产品B
 *
 * @author changhao
 */
public class ProductB implements Product {
  @Override
  public void display() {
    System.out.println("这是最新产品B...\t\n");
  }
}
