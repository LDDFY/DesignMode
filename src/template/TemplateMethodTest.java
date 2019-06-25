/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/25，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	TemplateMethodTest
 * 模块说明：
 * 修改历史：
 *  2019年-06月-25日  - changhao - 创建。
 */
package template;

/**
 * 模板方法测试类
 * 
 * @author changhao
 */
public class TemplateMethodTest {
  public static void main(String[] args) {
    AbstractTemplate abstractTemplate = new ConcreteTemplate();
    abstractTemplate.templateMethod();
  }
}
