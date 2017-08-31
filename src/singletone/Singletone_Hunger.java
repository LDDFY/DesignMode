package singletone;

public class Singletone_Hunger {

	public static Singletone_Hunger singletone = new Singletone_Hunger();

	// 将构造方法私有化使其无法进行实例化
	private Singletone_Hunger() {
	}

	public static Singletone_Hunger getSingletoneInstance() {
		return singletone;
	}

}
