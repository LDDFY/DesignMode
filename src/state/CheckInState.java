/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CheckInState
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package state;

/**
 * 入住状态：状态具体实现类
 * 
 * @author changhao
 */
public class CheckInState implements State {

  private final Room hotelManagement;

  public CheckInState(Room hotelManagement) {
    this.hotelManagement = hotelManagement;
  }

  @Override
  public void bookRoom() {
    System.out.println("该房间已经入住了");

  }

  @Override
  public void unsubscribeRoom() {

  }

  @Override
  public void checkInRoom() {
    System.out.println("该房间已经入住了");

  }

  @Override
  public void checkOutRoom() {
    System.out.println("退房成功");
    this.hotelManagement.setState(this.hotelManagement.getFreeTimeState());
  }
}
