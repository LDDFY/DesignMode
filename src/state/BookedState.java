/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/22，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	BookedState
 * 模块说明：
 * 修改历史：
 *  2019年-05月-22日  - changhao - 创建。
 */
package state;

/**
 * 预定状态：状态具体实现类
 *
 * @author changhao
 */
public class BookedState implements State {

	private final Room hotelManagement;

	public BookedState(Room hotelManagement) {
		this.hotelManagement = hotelManagement;
	}

	@Override
	public void bookRoom() {
		System.out.println("该房间已经预定了");
	}

	@Override
	public void unsubscribeRoom() {
		System.out.println("成功退订");
		this.hotelManagement.setState(this.hotelManagement.getFreeTimeState());
	}

	@Override
	public void checkInRoom() {
		System.out.println("入住成功");
		this.hotelManagement.setState(this.hotelManagement.getCheckInState());
	}

	@Override
	public void checkOutRoom() {

	}
}
