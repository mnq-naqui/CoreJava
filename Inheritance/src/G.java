class F {
	int i;
	static int j;

	void test1() {
		System.out.println("test1");
	}

	static void test2() {
		System.out.println("test2");
	}
}

public class G extends F{

	int k;
	
	static void test3() {
		System.out.println("test3");
	}
	public static void main(String[] args) {
		F.j=10;
		F.test2();
		G.test2();
		G.test3();
		System.out.println(G.j);
		
		F f1=new F();
		
		f1.i=20;
		f1.test1();
		
		G g1=new G();
		
		g1.i=30;
		g1.k=50;
		g1.test1();

	}

}
