package bridge;

public class MediumCoffee extends Coffee {

	public MediumCoffee() {
		setCoffeeImp();
	}

	@Override
	public void pourCoffee() {
		CoffeeImp coffeeImp = this.getCoffeeImp();
		System.out.println("中杯：");
		for(int i=0;i<2;i++) {
			coffeeImp.pourCoffeeImp();
		}
		System.out.println("----------------------");
	}

}
