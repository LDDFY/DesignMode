/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/8，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	PlaceholderSingleton
 * 模块说明：
 * 修改历史：
 *  2019年-05月-08日  - changhao - 创建。
 */
package singletone;

/**
 * 占位符式(内部类)
 *
 * @author changhao
 */
public class PlaceholderSingleton {

  private static boolean flag = false;

  private PlaceholderSingleton() {
    if (!flag) {
      flag = !flag;
    } else {
      throw new RuntimeException("不可使用构造方法实例化单例！");
    }
  }

  public static PlaceholderSingleton getInstance() {
    return SingletonHolder.instance;
  }

  public void doSomething() {
    System.out.println("占位符式(内部类) doSomething ...");
  }

  private static class SingletonHolder {
    private static PlaceholderSingleton instance = new PlaceholderSingleton();
  }
}
