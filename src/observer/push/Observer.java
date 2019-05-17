/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	Observer
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package observer.push;

/**
 * 推模式 观察者角色：Observer
 * 
 * @author changhao
 */
public interface Observer {
  /**
   * 更新状态
   * 
   * @param msg
   *          更新内容
   */
  void update(String msg);
}
