package interpreter;

/**
 * 非终结符表达式(Nonterminal Expression)
 * 
 * @author LDDFY
 */
public class Mul implements Expression {
  private Expression left;
  private Expression right;

  public Mul(Expression left, Expression right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interpret(Context context) {
    return left.interpret(context) * right.interpret(context);
  }
}
