package mnq.naqui;

class Swap{
public static void main(String[] args) {
		B x=new B(10);
		B y=new B (20);
		A a=new A();
		a.swap(x, y);
		System.out.println("x is: "+x.getVar()+" y is: "+y.getVar());
	}
	
}



class A {
	public void swap(B x, B y){
		B temp=x;
		x=y;
		y = temp;
	}
}

class B {
	int var;
	B (int i) {
		this.var=i;
		}
	public int getVar() {
		return var;
	}
	public void setVar(int var) {
		this.var = var;
	}
	
}