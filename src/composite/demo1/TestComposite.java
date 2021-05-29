package composite.demo1;

public class TestComposite {

  public static void main(String[] args) {
    Chassis chassis = new Chassis("PC chassis");
    chassis.add(new Disk("10G DISK"));

    Cabinet cabinet = new Cabinet("Tower");
    cabinet.add(chassis);

    System.out.println("netPrice=" + cabinet.netPrice());
    System.out.println("discountPrice=" + cabinet.discountPrice());
  }
}
