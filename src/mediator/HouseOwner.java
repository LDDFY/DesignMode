/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	HouseOwner
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

/**
 * 具体同事类-房主
 *
 * @author changhao
 */
public class HouseOwner extends Person {

	public HouseOwner(String name, Mediator mediator) {
		super(name, mediator);
	}

	/**
	 * @param message
	 */
	public void contact(String message) {
		mediator.contact(message, this);
	}

	public void getMessage(String message) {
		System.out.println(name + ", Get Message: " + message);
	}
}
