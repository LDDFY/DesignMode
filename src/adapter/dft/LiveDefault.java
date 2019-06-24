/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/13，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	LiveDefault
 * 模块说明：
 * 修改历史：
 *  2019年-05月-13日  - changhao - 创建。
 */
package adapter.dft;

/**
 * Live默认基础接口实现
 *
 * @author changhao
 */
public abstract class LiveDefault implements Live {

  @Override
  public void sleep() {
    System.out.println("sleep默认实现...");
  }

  @Override
  public void run() {
    System.out.println("run默认实现...");
  }
}
