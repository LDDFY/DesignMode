package singletone;

public class TestSingletone {
	
	public static void main(String[] args) {
		Singletone_Lazy singletone_Lazy=Singletone_Lazy.getSingletoneInstance();
		Singletone_Hunger singletone_Hunger=Singletone_Hunger.getSingletoneInstance();
		System.out.println(singletone_Lazy);
		System.out.println(singletone_Hunger);
	}
}
