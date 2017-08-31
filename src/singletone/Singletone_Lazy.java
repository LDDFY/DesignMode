package singletone;

public class Singletone_Lazy{
	
	private static Singletone_Lazy singletone=null;
	
	private Singletone_Lazy() {}

	public static Singletone_Lazy getSingletoneInstance() {
		
		synchronized (Singletone_Lazy.class) {
			if(singletone==null) {
				return new Singletone_Lazy();
			}else {
				return  singletone;
			}
		}
	}
}
