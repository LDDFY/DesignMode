/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Element
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package visitor;

/**
 * 元素角色：Element
 * 
 * @author changhao
 */
public abstract class Element {

  /**
   * 接收访问者
   * 
   * @param visitor
   */
  public abstract void accept(IVistor visitor);

  /**
   *操作
   * @param
   */
  public abstract void doSomething();
}
