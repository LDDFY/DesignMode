/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/22，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	StateTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-22日  - changhao - 创建。
 */
package state;

/**
 * 状态模式测试主类
 * 
 * @author changhao
 */
public class StateTest {

  public static void main(String[] args) {
    Room[] rooms = new Room[2];
    for (int i = 0; i < rooms.length; i++) {
      rooms[i] = new Room();
    }

    rooms[0].bookRoom();
    System.out.println(rooms[0]);
    rooms[0].checkInRoom();
    System.out.println(rooms[0]);
    rooms[0].bookRoom();
    System.out.println(rooms[0]);
    System.out.println("-------------");

    rooms[1].checkInRoom();
    rooms[1].bookRoom();
    rooms[1].checkOutRoom();
    rooms[1].bookRoom();
    System.out.println(rooms[1]);
  }
}
