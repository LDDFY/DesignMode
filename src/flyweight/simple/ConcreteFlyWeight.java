/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/17，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	ConcreteFlyWeight
 * 模块说明：
 * 修改历史：
 *  2019年-05月-17日  - changhao - 创建。
 */
package flyweight.simple;

/**
 * 具体享元角色
 * 
 * @author changhao
 */
public class ConcreteFlyWeight implements FlyWeight {
  private String str;

  public ConcreteFlyWeight(String str) {
    this.str = str;
  }

  @Override
  public void operation(String state) {
    System.out.println("内蕴状态：" + str);
    System.out.println("外蕴状态：" + state);
  }
}
