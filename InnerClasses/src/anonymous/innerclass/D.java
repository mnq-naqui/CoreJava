package anonymous.innerclass;

public class D {
	
	D(){
		System.out.println("D()");
	}
	
	D(int i){
		System.out.println("D(int)");
	}
	{
		System.out.println("D-IIB");
	}
}
