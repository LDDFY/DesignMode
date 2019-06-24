package factory.staticfactory;

/**
 * 静态工厂类
 *
 * @author changhao
 */
public class Factory {
  private static boolean flag = false;

  private Factory() {
    if (!flag) {
      flag = !flag;
    } else {
      throw new RuntimeException("cannot reInstance ProductAFactory!");
    }
  }

  public static Factory getInstance() {
    return FactoryInner.INSTANCE;
  }

  public Product creator(String series) {
    switch (series) {
    case "A":
      return new ProductA();
    case "B":
      return new ProductB();
    default:
      return null;
    }
  }

  private static class FactoryInner {
    public static Factory INSTANCE = new Factory();
  }
}
