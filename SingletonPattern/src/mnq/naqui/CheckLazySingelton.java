package mnq.naqui;

class SingletonLazyInit {
	
	private static SingletonLazyInit singletonLazyInit;
	
	private SingletonLazyInit(){
		
	}
	
	public static SingletonLazyInit createSingletonInstance(){
		if(null == singletonLazyInit){
			singletonLazyInit=new SingletonLazyInit();
			System.out.println("Singleton instance created");
		}
			return singletonLazyInit;
	}
	
	public void testInstance(){
		System.out.println("Same instance returned");
	}
}


public class CheckLazySingelton {
	public static void main(String[] args) {
		SingletonLazyInit.createSingletonInstance().testInstance();
		SingletonLazyInit.createSingletonInstance().testInstance();
		SingletonLazyInit.createSingletonInstance().testInstance();
		SingletonLazyInit.createSingletonInstance().testInstance();
	}
}
