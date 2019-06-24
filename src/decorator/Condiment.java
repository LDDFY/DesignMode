/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/16，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Condiment
 * 模块说明：
 * 修改历史：
 *  2019年-05月-16日  - changhao - 创建。
 */
package decorator;

/**
 * 装饰角色，所有装饰类的顶级类
 *
 * @author changhao
 */
public abstract class Condiment extends Pancake {

  @Override
  public abstract String getName();

  public void sold() {
    System.out.println(getName() + ":" + getPrice());
  }
}
