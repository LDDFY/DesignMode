package bridge;

public abstract class Coffee {

	public CoffeeImp coffeeImp;

	public void setCoffeeImp() {
		this.coffeeImp = CoffeeImpSingleton.getCoffeeImp();
	}

	public CoffeeImp getCoffeeImp() {
		return this.coffeeImp;
	}

	public abstract void pourCoffee();
}
