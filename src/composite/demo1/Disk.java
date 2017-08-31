package composite.demo1;

public class Disk extends Equipment {

	public Disk(String name) {
		super(name);
	}

	@Override
	public double netPrice() {

		return 1.5;
	}

	@Override
	public double discountPrice() {

		return 0.5;
	}
}
