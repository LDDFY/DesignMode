/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ConcreteSubject
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package observer.push;

/**
 * 推模式具体主题角色：ConcreteSubject
 * 
 * @author changhao
 */
public class ConcreteSubject extends Subject {
  private String msg;

  public ConcreteSubject(String msg) {
    this.msg = msg;
  }

  public void publish(String newMsg) {
    this.msg = newMsg;
    System.out.println("主题信息为： " + this.msg);
    this.notifyAllObservers(newMsg);
  }
}
