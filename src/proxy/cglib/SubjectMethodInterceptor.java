/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	SubjectMethodInterceptor
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Cglib 代理方法拦截器
 *
 * @author changhao
 */
public class SubjectMethodInterceptor implements MethodInterceptor {
  @Override
  public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
      throws Throwable {
    System.out.println("SubjectMethodInterceptor 执行方法：" + method.getName() + "...\t\n");
    proxy.invokeSuper(obj, args);
    System.out.println("SubjectMethodInterceptor 执行方法：" + method.getName() + "完毕...\t\n");
    return null;
  }
}
