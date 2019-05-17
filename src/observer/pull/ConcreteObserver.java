/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ConcreteObserver
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package observer.pull;

/**
 * 拉模式具体观察者：ConcreteObserver
 * 
 * @author changhao
 */
public class ConcreteObserver implements Observer {
  private String msg;

  @Override
  public void update(Subject subject) {
    ConcreteSubject concreteSubject = (ConcreteSubject) subject;
    this.msg = concreteSubject.getMsg();
    System.out.println("观察者收到信息为：" + this.msg);
  }
}
