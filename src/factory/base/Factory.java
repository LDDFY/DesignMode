package factory.base;

public class Factory {

	public static Sample creator(int whitch) {
		if (whitch == 1) {
			return new MySample();
		} else if (whitch == 2) {
			return new HisSample();
		} else {
			return null;
		}
	}
}
