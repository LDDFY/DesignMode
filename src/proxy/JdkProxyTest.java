/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	JdkProxyTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy;

import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.text.MessageFormat;

import proxy.base.RealSubject;
import proxy.base.Subject;
import proxy.jdk.InvocationHandlerImpl;
import sun.misc.ProxyGenerator;

/**
 * jdk动态代理创建机制----通过接口 JDK主要会做以下工作：
 * <p>
 * 1.获取 RealSubject上的所有接口列表； 2.确定要生成的代理类的类名，运行时期生成文件默认为：com.sun.proxy.$ProxyXXXX
 * ； 3.根据需要实现的接口信息，在代码中动态创建 该Proxy类的字节码； 4.将对应的字节码转换为对应的class 对象；
 * 5.创建InvocationHandler 实例handler，用来处理Proxy所有方法调用； 6.Proxy 的class对象
 * 以创建的handler对象为参数，实例化一个proxy对象
 *
 * @author changhao
 */
public class JdkProxyTest {

  /**
   * JDK动态代理调用
   */
  public static void invokeProxyMethod() {
    // 实例化需要代理的对象
    Subject subject = new RealSubject();
    // 1.获取对应的类加载器
    ClassLoader classLoader = subject.getClass().getClassLoader();
    // 2.获取代理对象所实现的所有接口
    Class[] interfaces = subject.getClass().getInterfaces();
    // 3.设置一个来自代理传过来的方法调用请求处理器，处理所有的代理对象上的方法调用
    InvocationHandler invocationHandler = new InvocationHandlerImpl(subject);
    /*
     * 4.生成代理对象： a.JDK会通过根据传入的参数信息动态地在内存中创建和.class 文件等同的字节码 b.然后根据相应的字节码转换成对应的class，
     * c.然后调用newInstance()创建实例
     */
    Object proxyObj = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

    // 使用接口调用对象方法。
    Subject proxy = (Subject) proxyObj;
    proxy.doSomething();
  }

  /**
   * 将根据类信息 动态生成的二进制字节码保存到硬盘中，
   *
   * @param proxyName
   *          代理类名称
   * @param clazz
   *          代理类Class
   * @return 生成文件路径
   * @throws Exception
   */
  public static String generateProxyClass(String proxyName, Class clazz) throws Exception {
    String path = MessageFormat.format("{0}{1}{2}", clazz.getResource("/").getPath(), proxyName,
        ".class");
    try (FileOutputStream out = new FileOutputStream(path)) {
      byte[] bytes = ProxyGenerator.generateProxyClass(proxyName, clazz.getInterfaces());
      out.write(bytes);
      out.flush();
      return path;
    } catch (Exception e) {
      throw new Exception(e);
    }
  }

  /**
   * 加载动态代理类class并生成代理对象
   *
   * @param path
   *          class 绝对路径
   * @param handler
   *          代理请求处理器
   * @return 代理对象
   * @throws Exception
   */
  public static Object loadProxyClass(String path, InvocationHandler handler) throws Exception {
    try {
      // 加载代理类
      Class clazz = Class.forName(path);
      // 获取代理类中带参构造方法
      Constructor constructor = clazz.getConstructor(InvocationHandler.class);
      // 生成实例
      return constructor.newInstance(handler);
    } catch (Exception e) {
      throw new Exception(e);
    }
  }

  /**
   * 测试动态生成动态加载代理类并执行方法
   *
   * @throws Exception
   */
  public static void dynamicProxyTest(String proxyClassName) throws Exception {
    String path = generateProxyClass(proxyClassName, RealSubject.class);
    System.out.println("代理类生成路径为：" + path + "\n");
    Object proxyObj = loadProxyClass(proxyClassName, new InvocationHandlerImpl(new RealSubject()));
    Subject proxy = (Subject) proxyObj;
    proxy.doSomething();
  }

  public static void main(String[] args) throws Exception {
    // 该设置用于输出jdk动态代理产生的类；默认位置为com.sun.proxy
    System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
    invokeProxyMethod();

    String proxyClassName = "RealSubjectProxy";
    dynamicProxyTest(proxyClassName);
  }
}
