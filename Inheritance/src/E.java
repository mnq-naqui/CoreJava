class C {
	int i;
	public void test(){
		System.out.println("test");
	}
}

class D extends C{
	int j;
	
	//Inside D there are total three members, two members inheriting from class C.
	
}
public class E {

	public static void main(String[] args) {
		
		D d1=new D();
		d1.i=10;
		d1.j=20;
		d1.test();
		System.out.println(d1.i);
		System.out.println(d1.j);

	}

}
