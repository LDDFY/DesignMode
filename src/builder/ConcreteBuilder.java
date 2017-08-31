package builder;

public class ConcreteBuilder implements Builder {
	
	Product product=new Product();

	@Override
	public void builderPartA() {
		System.out.println("this is builderPartA");
		product.setPartA(new PartA());

	}

	@Override
	public void builderPartB() {
		System.out.println("this is builderPartB");
		product.setPartB(new PartB());
	}

	@Override
	public void builderPartC() {
		System.out.println("this is builderPartC");
		product.setPartC(new PartC());
	}

	@Override
	public Product getResult() {
		System.out.println("this is getResult");
		return  product;
	}

}
