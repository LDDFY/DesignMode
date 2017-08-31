package bridge;

public class CoffeeImpSingleton {

	private static CoffeeImp coffeeImp;

	public CoffeeImpSingleton(CoffeeImp coffeeImp) {
		CoffeeImpSingleton.coffeeImp = coffeeImp;
	}

	public static CoffeeImp getCoffeeImp() {
		return coffeeImp;
	}
	
	public void setCoffeeImp(CoffeeImp coffeeImp) {
		CoffeeImpSingleton.coffeeImp = coffeeImp;
	}
}
