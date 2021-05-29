/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/15，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Road
 * 模块说明：
 * 修改历史：
 *  2019年-05月-15日  - changhao - 创建。
 */
package bridge;

/**
 * 抽象的路:Abstraction 修正抽象化角色
 *
 * @author changhao
 */
public abstract class Road {


	/**
	 * 交通工具
	 */
	protected Vehicle vehicle;

	/**
	 * 路
	 */
	public Road(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * 交通工具在路上的具体实现
	 */
	abstract void driveOnRoad();
}
