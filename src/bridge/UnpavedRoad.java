/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/15，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	UnpavedRoad
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
public class UnpavedRoad extends Road {

    public UnpavedRoad(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    void driveOnRoad() {
        vehicle.drive();
        System.out.println("行驶在柏油路...\n\t");
    }
}
