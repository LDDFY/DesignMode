/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	PlayCommand
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.base;

import command.Command;

/**
 * 具体命令角色：ConcreteCommand
 *
 * @author changhao
 */
public class PlayCommand implements Command {

  private AudioPlayer player;

  public PlayCommand(AudioPlayer player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.play();
  }
}
