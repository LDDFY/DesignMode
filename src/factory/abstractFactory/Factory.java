package factory.abstractFactory;

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
