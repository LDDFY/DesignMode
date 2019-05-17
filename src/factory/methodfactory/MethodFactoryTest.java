package factory.methodfactory;

/**
 * 工厂方法测试类
 *
 * @author changhao
 */
public class MethodFactoryTest {
  public static void main(String[] args) {
    ProductBFactory productBFactory = new ProductBFactory();
    ProductAFactory productAFactory = new ProductAFactory();

    Product productA = productAFactory.create();
    Product productB = productBFactory.create();

    productA.display();
    productB.display();
  }
}
