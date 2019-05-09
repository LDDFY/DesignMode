/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CglibProxyTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import proxy.cglib.CglibRealSubject;
import proxy.cglib.SubjectMethodInterceptor;

/**
 * Cglib 生成动态代理类的机制----通过类继承
 * 1.查找A上的所有非final 的public类型的方法定义；
 * 2.将这些方法的定义转换成字节码；
 * 3.将组成的字节码转换成相应的代理的class对象；
 * 4.实现 MethodInterceptor接口，用来处理 对代理类上所有方法的请求（这个接口和JDK动态代理InvocationHandler的功能和角色是一样的）
 *
 * @author changhao
 */
public class CglibProxyTest {
    public static void proxyTest() {
        CglibRealSubject subject = new CglibRealSubject();
        MethodInterceptor interceptor = new SubjectMethodInterceptor();
        //cglib 中加强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类
        enhancer.setSuperclass(subject.getClass());
        // 设置回调，这里相当于是对于代理类上所有方法的调用，都会调用CallBack，而Callback则需要实行intercept()方法进行拦截
        enhancer.setCallback(interceptor);
        //创建代理对象
        Object proxyObj = enhancer.create();

        CglibRealSubject proxy = (CglibRealSubject) proxyObj;
        proxy.doSomething();
        proxy.doAnotherThing();
    }

    public static void main(String[] args) {
        //生成代理类路径
        String paths = CglibProxyTest.class.getResource(".").getPath();
        //该设置用于输出cglib动态代理产生的类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, paths);
        proxyTest();
    }

}
