package factory.abstractfactory;

/**
 * 抽象工厂具体类
 *
 * @author wwwch
 */
public class Factory extends AbstractFactory {

	@Override
	public SampleA createA(int witch) {
		switch (witch) {
			case 1:
				return new SampleAA();
			case 2:
				return new SampleAB();
			default:
				return null;
		}
	}

	@Override
	public SampleB createB(int witch) {
		switch (witch) {
			case 1:
				return new SampleBA();
			case 2:
				return new SampleBB();
			default:
				return null;
		}
	}
}
