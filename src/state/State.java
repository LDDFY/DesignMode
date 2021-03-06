/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	State
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package state;

/**
 * 状态接口：State
 *
 * @author changhao
 */
public interface State {

	/**
	 * 预定
	 */
	void bookRoom();

	/**
	 * 退订
	 */
	void unsubscribeRoom();

	/**
	 * 入住
	 */
	void checkInRoom();

	/**
	 * 查看
	 */
	void checkOutRoom();
}
