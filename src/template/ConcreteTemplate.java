/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	ConcreteTemplate
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package template;

import lombok.extern.slf4j.Slf4j;

/**
 * 具体模板类
 * 
 * @author changhao
 */
@Slf4j
public class ConcreteTemplate extends AbstractTemplate {
  @Override
  protected void abstractMethod() {
    log.info("ConcreteTemplate-abstractMethod");
  }

  @Override
  protected void doHookMethod() {
    log.info("ConcreteTemplate-doHookMethod");
  }
}
