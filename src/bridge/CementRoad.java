/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/15，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	CementRoad
 * 模块说明：
 * 修改历史：
 *  2019年-05月-15日  - changhao - 创建。
 */
package bridge;

/**
 * 具体的路：RefinedAbstraction
 *
 * @author changhao
 */
public class CementRoad extends Road {

  public CementRoad(Vehicle vehicle) {
    super(vehicle);
  }

  @Override
  void driveOnRoad() {
    vehicle.drive();
    System.out.println("行驶在石子路...\n\t");
  }
}
