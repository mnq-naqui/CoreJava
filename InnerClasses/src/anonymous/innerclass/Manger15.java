package anonymous.innerclass;

public class Manger15 {
	/*I you want to initialize NSM inside AIC use IIB not const coz we cannot 
	 * incorporate const iinside AIC as AIC has no name*/
	public static void main(String[] args) {
		D d1=new D(){
			{
				System.out.println("AIC-IIB");
			}
		};
		System.out.println("=======================================");
		
		D d2=new D(14){
			{
				System.out.println("AIC-IIB");
			}
		};
		
	}
}
