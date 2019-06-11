/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Tenant
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

/**
 * @author changhao
 */
public class Tenant extends Person {
  public Tenant(String name, Mediator meidator) {
    super(name, meidator);
  }

  public void contact(String message) {
    meidator.contact(message, this);
  }

  public void getMessage(String message) {
    System.out.println("Tenant : " + name + ", Get Message: " + message);
  }
}