package factory.abstractfactory;

/**
 * A子系列产品AB
 *
 * @author changhao
 *
 */
public class SampleAB implements SampleA {

  @Override
  public void say() {
    System.out.println("this is SampleAB say!");
  }
}
