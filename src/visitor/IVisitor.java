/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	IVisitor
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package visitor;

/**
 * 访问者角色:Vistor
 * 
 * @author changhao
 */
public interface IVisitor {
  /**
   * 访问对象
   * 
   * @param e1
   */
  void visit(ConcreteElement1 e1);

  /**
   * 访问对象
   * 
   * @param e2
   */
  void visit(ConcreteElement2 e2);
}
