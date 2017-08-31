package decorator;

public class Employee implements Project {

	@Override
	public void doCoding() {
		System.out.println("码农在加班写代码！！");
	}

}
