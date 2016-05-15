//Program no 21 First Lara Test
package pack1;

class F {

	static int i;
	static {
		i = 10;
		System.out.println("C-SIB");
	}

	static void test() {
		System.out.println("C-Test");
	}
}

public class G {
	static {
		System.out.println("D-SIB");
	}

	public static void main(String[] args) {
		System.out.println(1);
		F.test();
		System.out.println(2);
System.out.println(F.i);
	}
}
