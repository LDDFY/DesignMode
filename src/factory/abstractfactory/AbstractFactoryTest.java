package factory.abstractfactory;

/**
 * 抽象工厂测试类
 * 
 * @author changhao
 */
public class AbstractFactoryTest {

  public static void main(String[] args) {
    Factory f = new Factory();
    SampleA sampleAA = f.createA(1);
    SampleA sampleAB = f.createA(2);
    sampleAA.say();
    sampleAB.say();

    SampleB sampleBA = f.createB(1);
    SampleB sampleBB = f.createB(2);
    sampleBA.say();
    sampleBB.say();
  }
}
