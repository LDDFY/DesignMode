/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Expression
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package interpreter;

/**
 * 抽象表达式：Expression
 * 
 * @author changhao
 */
public interface Expression {

  /**
   * 解释器
   * 
   * @param context
   *          环境上下文
   * @return
   */
  int interpret(Context context);
}
