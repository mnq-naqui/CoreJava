package pack1;

public  class K {
	static void test(int i){
		System.out.println("int");
	}
	static void test(byte b){
		System.out.println("byte");
	}
	
	public static void main(String[] args) {
		test(20);
	}
}
