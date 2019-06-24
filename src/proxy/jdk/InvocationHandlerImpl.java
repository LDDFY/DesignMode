/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	InvocationHandlerImpl
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import proxy.base.Subject;

/**
 * jdk动态代理执行器
 *
 * @author changhao
 */
public class InvocationHandlerImpl implements InvocationHandler {
  private Subject subject;

  public InvocationHandlerImpl(Subject subject) {
    this.subject = subject;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("InvocationHandler 执行：" + method.getName() + "方法...\t\n");
    method.invoke(subject, args);
    System.out.println("InvocationHandler 执行：" + method.getName() + "完毕...\t\n");
    return null;
  }
}
