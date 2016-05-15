//Program no 19 First Lara Test
package pack1;

public class E {
	static int i = test();

	public static void main(String[] args) {
		System.out.println("main:" + i);
	}

	static int test() {
		main(null);
		return 20;
	}
}
