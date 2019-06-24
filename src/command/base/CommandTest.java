/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	CommandTest
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.base;

import command.Command;

/**
 * 命令模式测试类
 *
 * @author changhao
 */
public class CommandTest {
  public static void main(String[] args) {
    // 接收者角色（Receiver）
    AudioPlayer audioPlayer = new AudioPlayer();

    // 具体命令角色(ConcreteCommand)
    Command playCommand = new PlayCommand(audioPlayer);
    Command rewindCommand = new RewindCommand(audioPlayer);
    Command stopCommand = new StopCommand(audioPlayer);

    // 请求者角色（Invoker)
    Keypad keypad = new Keypad();
    keypad.setPlayCommand(playCommand);
    keypad.setRewindCommand(rewindCommand);
    keypad.setStopCommand(stopCommand);

    keypad.play();
    keypad.rewind();
    keypad.stop();
  }
}
