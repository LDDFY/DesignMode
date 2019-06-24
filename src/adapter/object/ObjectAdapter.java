/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ObjectAdapter
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package adapter.object;

import adapter.Adaptee;
import adapter.Target;

/**
 * 对象适配器
 *
 * @author changhao
 */
public class ObjectAdapter implements Target {
  private Adaptee adaptee;

  public ObjectAdapter(Adaptee adaptee) {
    this.adaptee = adaptee;
  }

  @Override
  public void request() {
    System.out.println("对象适配器开始适配...\t\n");
    this.adaptee.specificRequest();
    System.out.println("对象适配器适配结束...\t\n");
  }
}
