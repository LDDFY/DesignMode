/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Add
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

/**
 * 非终结符表达式(Nonterminal Expression)
 * 
 * @author changhao
 */
public class Add implements Expression {
  private Expression left;
  private Expression right;

  public Add(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Context context) {
    return left.interpret(context) + right.interpret(context);
  }
}
