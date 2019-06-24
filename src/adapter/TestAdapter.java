package adapter;

import adapter.clazz.Adapter;
import adapter.dft.Live;
import adapter.dft.LiveTarget;
import adapter.object.ObjectAdapter;

/***
 * 适配器模式测试类
 * 
 * @author changhao
 */
public class TestAdapter {
  /**
   * 默认适配器
   */
  public static void adapterDefaultTest() {
    Live adapter = new LiveTarget();
    adapter.eat();
  }

  /**
   * 类适配器
   */
  public static void adapterTest() {
    Target adapter = new Adapter();
    adapter.request();
  }

  /**
   * 对象适配器
   */
  public static void objectAdapterTest() {
    Adaptee adaptee = new Adaptee();
    Target adapter = new ObjectAdapter(adaptee);
    adapter.request();
  }

  public static void main(String[] args) {
    adapterTest();
    objectAdapterTest();
    adapterDefaultTest();
  }
}
