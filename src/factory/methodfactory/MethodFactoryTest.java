package factory.methodfactory;

/**
 * 工厂方法测试类
 *
 * @author changhao
 */
public class MethodFactoryTest {
	public static void main(String[] args) {
    ProductAFactory factoryA = new ProductAFactory();
    ProductBFactory factoryB = new ProductBFactory();

		Product productA = factoryA.create();
		Product productB = factoryB.create();

		productA.display();
		productB.display();
	}
}
