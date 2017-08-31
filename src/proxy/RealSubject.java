package proxy;

public class RealSubject extends Subject {
	
	@Override
	public void buyBook() {
		System.out.println("This is a Book");
	};

}
