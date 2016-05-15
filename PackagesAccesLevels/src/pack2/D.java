package pack2;

import pack1.P;

public class D extends P {

	public static void main(String[] args) {
		
		P p1=new P();
		p1.z=1;
		//p1.x=1;
		//p1.y=1;
		
		D d1=new D();
		
		d1.y=2;
		d1.z=2;
		//d1.x=2;
		System.out.println("done");
	}

}
