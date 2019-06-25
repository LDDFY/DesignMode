/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	ConcreteElement1
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体元素角色:Concrete Element
 * 
 * @author changhao
 */
@Slf4j
public class ConcreteElement2 extends Element {
  @Override
  public void accept(IVistor vistor) {
    vistor.visit(this);
  }

  @Override
  public void doSomething() {
    log.info("Element2");
  }
}
