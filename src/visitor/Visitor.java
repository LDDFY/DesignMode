/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Visitor
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package visitor;

/**
 * 具体访问者角色:Concrete Visitor
 * 
 * @author changhao
 */
public class Visitor implements IVistor {
  @Override
  public void visit(ConcreteElement1 e1) {
    e1.doSomething();
  }

  @Override
  public void visit(ConcreteElement2 e2) {
    e2.doSomething();
  }
}
