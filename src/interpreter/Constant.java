/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Constant
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

/**
 * 终结符表达式:Terminal Expression
 * 
 * @author changhao
 */
public class Constant implements Expression {

  private int i;

  public Constant(int i) {
    this.i = i;
  }

  @Override
  public int interpret(Context context) {
    return i;
  }
}
