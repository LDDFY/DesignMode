package factory.abstractfactory;

/**
 * 抽象工厂测试类
 *
 * @author changhao
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ProductBFactory productBFactory = new ProductBFactory();
        ProductAFactory productAFactory = new ProductAFactory();

        Product productA = productAFactory.create();
        Product productB = productBFactory.create();

        productA.display();
        productB.display();
    }
}
