/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/5/15，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	VehicleTest
 * 模块说明：
 * 修改历史：
 *  2019年-05月-15日  - changhao - 创建。
 */
package bridge;

/**
 * @author changhao
 */
public class VehicleTest {
    public static void main(String[] args) {
        Road road = new CementRoad(new Car());
        road.driveOnRoad();
        road = new UnpavedRoad(new Bus());
        road.driveOnRoad();
    }
}
