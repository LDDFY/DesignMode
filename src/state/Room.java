/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Room
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package state;

import lombok.Data;

/**
 * 房间：环境角色Context
 *
 * @author changhao
 */
@Data
public class Room {

	private State state;
	private State freeTimeState;
	private State checkInState;
	private State bookedState;

	public Room() {
		this.freeTimeState = new FreeTimeState(this);
		this.checkInState = new CheckInState(this);
		this.bookedState = new BookedState(this);
		this.state = this.freeTimeState;
	}

	public void bookRoom() {
		state.bookRoom();
	}

	public void unsubscribeRoom() {
		state.unsubscribeRoom();
	}

	public void checkInRoom() {
		state.checkInRoom();
	}

	public void checkOutRoom() {
		state.checkOutRoom();
	}

	@Override
	public String toString() {
		return "该房间的状态是:" + getState().getClass().getName();
	}
}
