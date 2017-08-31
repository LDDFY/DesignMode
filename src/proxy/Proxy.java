package proxy;

public class Proxy extends Subject{

	@Override
	public void buyBook() {
		Subject subject=new RealSubject();
		subject.buyBook();
	}

	
}
