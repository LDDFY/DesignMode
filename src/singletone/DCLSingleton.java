/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/8，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	DCLSingleton
 * 模块说明：
 * 修改历史：
 *  2019年-05月-08日  - changhao - 创建。
 */
package singletone;

import java.io.Serializable;

/**
 * 双重检测
 *
 * @author changhao
 */
public class DCLSingleton implements Serializable {

  /**
   * 对象创建的过程为： 1.申请空间，2.初始化对象，3.修改指针引用
   * 由于编译器优化2和3的步骤有可能产生变化，导致在初始化对象时，指针引用对象为空。此时就会多创建对象实例。
   * 使用volatile声明的变量可以强制屏蔽编译器和JIT的优化工作，使其按照顺序初始化对象。
   */
  public volatile static DCLSingleton instance = null;

  private DCLSingleton() {
    // 预防反射造成单例造成破坏
    if (instance != null) {
      throw new RuntimeException("不可使用构造方法实例化单例！");
    }
  }

  public static DCLSingleton getInstance() {
    // 使用本地变量减少对volatile变量的访问，这样可以使得这个单例的整体性能提升25%
    // https://en.m.wikipedia.org/wiki/Double-checked_locking?from=singlemessage&isappinstalled=0#Usage_in_Java
    DCLSingleton localRef = instance;
    if (null == localRef) {
      synchronized (DCLSingleton.class) {
        localRef = instance;
        if (null == localRef) {
          localRef = instance = new DCLSingleton();
        }
      }
    }
    return localRef;
  }

  public void doSomething() {
    System.out.println("双重检测单例 doSomething ...");
  }
}
