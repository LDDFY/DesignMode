/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	MacroCommand
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.marco;

import command.Command;

/**
 * 宏命令接口
 * 
 * @author changhao
 */
public interface MacroCommand extends Command {

  /**
   * 添加命令
   */
  void add(Command command);

  /**
   * 删除命令
   */
  void remove(Command command);
}
