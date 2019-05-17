package factory.staticfactory;

/**
 * 静态工厂测试类
 *
 * @author changhao
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        Product productA = factory.creator("A");
        Product productB = factory.creator("B");
        productA.display();
        productB.display();
    }
}
