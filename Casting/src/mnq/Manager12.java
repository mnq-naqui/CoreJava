package mnq;

public class Manager12 {
	public static void main(String[] args) {
		A a1=new A();
		if(a1 instanceof B){
		B b1=(B) a1;}
		System.out.println("done");
	}

}
