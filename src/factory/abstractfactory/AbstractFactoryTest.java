package factory.abstractfactory;

/**
 * 抽象工厂测试类
 *
 * @author changhao
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		Factory f = new Factory();
		SampleA a = f.createA(1);
		SampleA b = f.createA(2);
		SampleB c = f.createB(1);
		SampleB d = f.createB(2);
    a.say();
    b.say();
		c.say();
		d.say();
	}
}
