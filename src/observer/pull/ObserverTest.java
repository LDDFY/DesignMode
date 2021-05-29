/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ObserverTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package observer.pull;

/**
 * 观察者模式拉模式测试代码
 * 
 * @author changhao
 */
public class ObserverTest {

  public static void main(String[] args) {
    Observer observer = new ConcreteObserver();
    ConcreteSubject subject = new ConcreteSubject("Topic");
    subject.attach(observer);
    subject.publish("new Topic");
  }
}
