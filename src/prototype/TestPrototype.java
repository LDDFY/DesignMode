package prototype;

public class TestPrototype {
	
	public static void main(String[] args) {
		AbstractName nameA=new NameA("AA");
		System.out.println(nameA.getName()+":"+nameA.getClass().toString());
		AbstractName nameB=new NameB("BB");
		System.out.println(nameB.getName()+":"+nameB.getClass().toString());
	}

}
