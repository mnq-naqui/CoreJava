/**
 * 
 */
package mnq;

/**
 * @author Naqui
 *Program No 222
 */
public class Manager17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A a1=new C();
		
		if (a1 instanceof F){
			F a2=(F) a1;
			System.out.println("Explicit downcasting to F");
		}else{
			System.out.println("Explicit downcasting not occurs");
		}
	}

}
