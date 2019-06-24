/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	InterpreterTest
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

import lombok.extern.slf4j.Slf4j;

/**
 * 解释器模式测试类
 *
 * @author changhao
 */
@Slf4j
public class InterpreterTest {

  public static void main(String[] args) {
    // (a*b)/(a-b+3)
    Context context = new Context();
    Variable a = new Variable();
    Variable b = new Variable();
    Constant c = new Constant(3);

    context.addValue(a, 12);
    context.addValue(b, 3);

    Expression expression = new Divl(new Mul(a, b), new Add(new Sub(a, b), c));

    log.info("Result:{}", expression.interpret(context));
  }
}
