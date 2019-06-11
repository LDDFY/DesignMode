/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Person
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

/**
 * @author changhao
 */
public abstract class Person {
  protected String name;
  protected Mediator meidator;

  public Person(String name, Mediator meidator) {
    this.name = name;
    this.meidator = meidator;
  }
}