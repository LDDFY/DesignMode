package builder;

public class TestBuilder {
	
	public static void main(String[] args) {

		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.Construct();
		Product product = builder.getResult();
		product.getPartA().SayName();
		product.getPartB().SayName();
		product.getPartC().SayName();
	}
}
