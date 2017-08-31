package builder;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder=builder;
	}

	public void Construct() {
		builder.builderPartA();
		builder.builderPartB();
		builder.builderPartC();
	}
}
