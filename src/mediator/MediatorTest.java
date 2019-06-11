/*
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019/6/11，所有权利保留。
 *
 * 项目名：	DesignMode
 * 文件名：	MediatorTest
 * 模块说明：
 * 修改历史：
 *  2019年-06月-11日  - changhao - 创建。
 */
package mediator;

/**
 * 中介者模式测试类
 *
 * @author changhao
 */
public class MediatorTest {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();
        HouseOwner houseOwner = new HouseOwner("house owner", mediator);
        Tenant tenant = new Tenant("tenant", mediator);
        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.contact("I wanna a house");
        houseOwner.contact("I have ~");
    }
}
