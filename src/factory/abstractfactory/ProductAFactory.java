package factory.abstractfactory;

/**
 * 产品A工厂类
 *
 * @author changhao
 */
public class ProductAFactory extends AbstractFactory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
