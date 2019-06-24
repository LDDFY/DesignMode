/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	Keypad
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.base;

import command.Command;
import lombok.Setter;

/**
 * 请求者角色:Invoker
 * 
 * @author changhao
 */
public class Keypad {

  @Setter
  private Command playCommand;

  @Setter
  private Command rewindCommand;

  @Setter
  private Command stopCommand;

  public void play() {
    playCommand.execute();
  }

  public void rewind() {
    rewindCommand.execute();
  }

  public void stop() {
    stopCommand.execute();
  }
}
