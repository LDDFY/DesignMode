/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	MacroCommandTest
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.marco;

import command.Command;
import command.base.AudioPlayer;
import command.base.PlayCommand;
import command.base.RewindCommand;
import command.base.StopCommand;

/**
 * @author changhao
 */
public class MacroCommandTest {
  public static void main(String[] args) {
    // 接收者角色（Receiver）
    AudioPlayer audioPlayer = new AudioPlayer();

    // 具体命令角色(ConcreteCommand)
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);

    // 宏命令角色
    MacroAudioCommand macroCommand = new MacroAudioCommand();
    macroCommand.add(playCommand);
    macroCommand.add(rewindCommand);
    macroCommand.add(stopCommand);
    // 执行
    macroCommand.execute();
  }
}
