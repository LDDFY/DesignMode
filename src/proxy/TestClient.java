package proxy;

public class TestClient {

	public static void main(String[] args) {
		Subject proxy=new Proxy();
		proxy.buyBook();
	}
}
