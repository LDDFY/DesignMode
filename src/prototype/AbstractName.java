package prototype;

public abstract class AbstractName implements Cloneable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (Exception e) {
			System.out.println("has error!");
		}
		return object;
	}
}
