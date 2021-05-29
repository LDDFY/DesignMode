/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	RealSubject
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy.base;

/**
 * 被代理实现类 （真实角色）
 *
 * @author changhao
 */
public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("RealSubject do something...");
	}
}
