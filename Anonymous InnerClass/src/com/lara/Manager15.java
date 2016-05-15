/**
 Program no 67 Lara Material
 If u wanna initialize AIC, use AIC not constructor. We can not incorporate constructor inside 
 AIC since AIC has no name 
 */
package com.lara;
class D
{
	D()
	{
		System.out.println("D()");
	}
	D(int i)
	{
		System.out.println("D(int)");
	}
	{
		System.out.println("D-IIB");
	}
}
public class Manager15 {

	
	public static void main(String[] args) {
		D d1=new D()
		{
			{
				System.out.println("AIC-IIB");
			}
		};
		System.out.println("============================");
		D d2=new D(10)
		{
			{
				System.out.println("AIC-IIB");
			}
		};
/* Conclusion:- Super class to AIC may be concrete class, abstract class ,interface AIC shd be concrete coz
 * wherever u r defining there itself u are creating the object of AIC.Hence no abstract AIC.
 * 2.WE can't create object more than once since they have no name we cant refer object.
 * 3.Inside Aic we can't keep const we can keep only IIB
*/	

	}

}
