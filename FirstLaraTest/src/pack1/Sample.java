package pack1;

class Test{
	int i;
	void print(){
		System.out.println("Test print()");
	}
	
	void display(){
		System.out.println("Test display");
	}
}

public class Sample extends Test {
	
	public void print () {
		System.out.println("Sample print ()");
	}
		public void show(){
			System.out.println("Sample show");
		
	}
	
	public static void main(String[] args) {
		Sample s1=new Sample();
		Test t1=new Sample();
		
		t1.display();
		t1.print();
		
		
	}
}
