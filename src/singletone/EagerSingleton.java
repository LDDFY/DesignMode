/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/8，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	EagerSingleton
 * 模块说明：
 * 修改历史：
 *  2019年-05月-08日  - changhao - 创建。
 */
package singletone;

import java.io.Serializable;

/**
 * 饿汉模式
 *
 * @author changhao
 */
public class EagerSingleton implements Serializable {

  private static EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {
    // 预防反射造成单例造成破坏
    if (instance != null) {
      throw new RuntimeException("不可使用构造方法实例化单例！");
    }
  }

  public static EagerSingleton getInstance() {
    return instance;
  }

  public void doSomething() {
    System.out.println("饿汉模式 doSomething ...");
  }

  /**
   * 保证枚举类不被序列化破坏，需要重写readResolve方法。
   *
   * @return
   */
  private Object readResolve() {
    System.out.println("调用 EagerSingleton 的 readResolve 方法...");
    return instance;
  }
}
