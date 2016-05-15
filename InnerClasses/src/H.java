/** 
 * 
 * Program no 41 Lara Material
How to create object or use Inner Classes

This  program tells how NSM can be accessed inside SM with ref var and also SM can be used inside static method
*/


public class H {

	/**
	 * @param args
	 */
	class I {

	}

	static class J {

	}

}
class Manager
{
	public static void main(String[] args) {
		H.I obj1=null;
		H.J obj2=null;
		obj1=new H().new I();
		obj2=new H.J();
		H h1=new H();
		obj1=h1.new I();
		System.out.println("done");
	}
}
