package composite.demo1;

public class TestComposite {
	public static void main(String[] args) {
		Cabinet cabinet = new Cabinet("Tower");
		Chassis chassis=new Chassis("PC chassis");
		cabinet.add(chassis);
		chassis.add(new Disk("10G DISK"));
		
		System.out.println("netPrice="+cabinet.netPrice());
		System.out.println("discountPrice="+cabinet.discountPrice());
	}
}
