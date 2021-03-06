/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Variable
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

/**
 * @author changhao
 */
public class Variable implements Expression {
  @Override
  public int interpret(Context context) {
    return context.lookupValue(this);
  }
}
