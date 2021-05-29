package factory.methodfactory;

/**
 * 产品A工厂类
 *
 * @author changhao
 */
public class ProductAFactory extends MethodFactory {

  @Override
  public Product create() {
    return new ProductA();
  }
}
