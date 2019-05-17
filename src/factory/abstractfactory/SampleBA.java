package factory.abstractfactory;

/**
 * B子系列产品BA
 * 
 * @author changhao
 */
public class SampleBA implements SampleB {
  @Override
  public void say() {
    System.out.println("this is SampleBA say!");
  }
}
