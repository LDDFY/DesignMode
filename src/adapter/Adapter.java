package adapter;

public class Adapter extends A implements ClassB {

	@Override
	public void isB() {
		this.isA();		
	}

}
