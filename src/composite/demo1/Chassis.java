package composite.demo1;

public class Chassis extends CompositeEquipment{

	public Chassis(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		
		return super.netPrice()+1;
	}

	@Override
	public double discountPrice() {

		return super.discountPrice()+0.5;
	}

}
