package composite.demo1;

/**
 * 具体实现类（leaf）底盘
 *
 * @author changhao
 */
public class Chassis extends CompositeEquipment {

    public Chassis(String name) {
        super(name);
    }

    @Override
    public double netPrice() {
        //复写网络价格
        return super.netPrice() + 1;
    }

    @Override
    public double discountPrice() {
        //复写折扣价格
        return super.discountPrice() + 0.5;
    }
}
