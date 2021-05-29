/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	SubjectProxy
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy.base;

/**
 * Subject代理类 -代理角色
 *
 * @author changhao
 */
public class SubjectProxy implements Subject {

	private final Subject subject;

	public SubjectProxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void doSomething() {
		System.out.println("SubjectProxy 执行 doSomething 方法...");
		subject.doSomething();
		System.out.println("SubjectProxy 执行完毕...");
	}
}
