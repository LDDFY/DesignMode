/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/24，所有权利保留。
 *
 * 项目名：	com.designmode
 * 文件名：	MacroAudioCommand
 * 模块说明：
 * 修改历史：
 *  2019年-06月-24日  - changhao - 创建。
 */
package command.marco;

import java.util.ArrayList;
import java.util.List;

import command.Command;

/**
 * 宏命令实现类
 * 
 * @author changhao
 */
public class MacroAudioCommand implements MacroCommand {

  private final List<Command> commandList = new ArrayList<>();

  @Override
  public void add(Command command) {
    commandList.add(command);
  }

  @Override
  public void remove(Command command) {
    commandList.remove(command);
  }

  @Override
  public void execute() {
    for (Command command : commandList) {
      command.execute();
    }
  }
}
