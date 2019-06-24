/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/9，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ProxyTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-09日  - changhao - 创建。
 */
package proxy;

import proxy.base.RealSubject;
import proxy.base.Subject;
import proxy.base.SubjectProxy;

/**
 * 代理测试
 *
 * @author changhao
 */
public class ProxyTest {

  /**
   * 基础代理
   */
  public static void baseTest() {
    Subject subject = new RealSubject();
    SubjectProxy proxy = new SubjectProxy(subject);
    proxy.doSomething();
  }

  public static void main(String[] args) {
    baseTest();
  }
}
