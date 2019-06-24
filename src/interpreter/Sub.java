package interpreter;

/**
 * 非终结符表达式(Nonterminal Expression)
 * 
 * @author LDDFY
 */
public class Sub implements Expression {
  private Expression left;
  private Expression right;

  public Sub(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Context context) {
    return left.interpret(context) - right.interpret(context);
  }
}
