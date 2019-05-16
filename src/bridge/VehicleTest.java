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
 * 当一个类又两个变化维度时候可以使用桥接模式处理；
 * 当前测试类变化原因：1.抽象的路。2.车
 * <p>
 * 桥接模式测试类
 *
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
