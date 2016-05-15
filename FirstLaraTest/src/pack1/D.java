//Pg 11 First Test Lara
package pack1;

public class D {
	static int i;

	public static void main(String[] args) {
		System.out.println("from main:" + i);
		i = 10;
		//test();
	}

	void test() {
		System.out.println("from test" + i);
	}
}
