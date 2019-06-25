/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	AbstractTemplate
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package template;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象模板类
 * 
 * @author changhao
 */
@Slf4j
public abstract class AbstractTemplate {

  public void templateMethod() {
    abstractMethod();
    doHookMethod();
    concreteMethod();
  }

  protected abstract void abstractMethod();

  protected void doHookMethod() {
  }

  protected final void concreteMethod() {
    log.info("invoke concreteMethod");
  }
}
