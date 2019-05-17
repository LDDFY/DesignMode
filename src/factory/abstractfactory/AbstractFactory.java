package factory.abstractfactory;

/**
 * 抽象工厂方法基础类
 * 
 * @author changhao
 */
public abstract class AbstractFactory {

  /**
   * 产品A类的工厂方法
   * 
   * @param witch
   * @return
   */
  public abstract SampleA createA(int witch);

  /**
   * 产品B类的工厂方法
   *
   * @param witch
   * @return
   */
  public abstract SampleB createB(int witch);
}
