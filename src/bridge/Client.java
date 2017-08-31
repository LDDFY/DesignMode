package bridge;

public class Client {
	public static void main(String[] args) {
		CoffeeImpSingleton singleton=new CoffeeImpSingleton(new MilkCoffeeImp());
		// 中杯加奶
		MediumCoffee mediumCoffee = new MediumCoffee();
		mediumCoffee.pourCoffee();
		
		//大杯加奶
		SuperSizeCoffee sizeCoffee=new SuperSizeCoffee();
		sizeCoffee.pourCoffee();
		
		//设置为清香
		singleton.setCoffeeImp(new FragrantCoffeeImp());
		
		//中杯不加奶
		MediumCoffee mediumCoffeeNoMilk = new MediumCoffee();
		mediumCoffeeNoMilk.pourCoffee();
		
		//大杯不加奶
		SuperSizeCoffee sizeCoffeeNoMilk=new SuperSizeCoffee();
		sizeCoffeeNoMilk.pourCoffee();
	}
}
