package mnq.naqui;

public class OutputOfProgram {
	static void method(String str){
		System.out.println("done from string");
	}
	static void method(Object str){
		System.out.println("done from Object");
	}
	public static void main(String[] args) {

method("null");
	}

}
