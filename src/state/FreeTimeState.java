/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	FreeTimeState
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package state;

/**
 * 空闲房间状态：状态具体实现类
 *
 * @author changhao
 */
public class FreeTimeState implements State {

	private final Room hotelManagement;

	public FreeTimeState(Room hotelManagement) {
		this.hotelManagement = hotelManagement;
	}

	@Override
	public void bookRoom() {
		System.out.println("您已经预定成功了！");
		this.hotelManagement.setState(this.hotelManagement.getBookedState());
	}

	@Override
	public void unsubscribeRoom() {

	}

	@Override
	public void checkInRoom() {
		System.out.println("您已经入住了！");
		this.hotelManagement.setState(this.hotelManagement.getCheckInState());
	}

	@Override
	public void checkOutRoom() {

	}
}
