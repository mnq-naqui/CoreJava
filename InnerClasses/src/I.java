//Program 42 
//Local Inner Class
public class I {
	public static void main(String[] args) {
		class A
		{
			int i=12;
			
		}
		A a1=new A();
		System.out.println(a1.i);
		a1.i=21;
		System.out.println(a1.i);
	}
}
