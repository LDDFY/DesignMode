package factory.base;

public class TestFactory {

	public static void main(String[] args) {
		Sample mySample = Factory.creator(1);
		mySample.Say();
		Sample hisSample = Factory.creator(2);
		hisSample.Say();
	}
}
