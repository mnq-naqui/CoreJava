package mnq.naqui;


//An array consists of 1 and zeros arrange the arrange the array such that it contains all
//the zeros after that all the ones

public class InfyQue {

	
	public static void main(String[] args) {
	int [] array={1,0,1,1,0,1,1,0,0,1};
	int countOfZeros=0;
	
	solution1(array, countOfZeros);
		
	solution2(array, countOfZeros);
			}
	
	
	//solution 1
	private static void solution1(int[] array, int countOfZeros) {
		for (int i = 0; i < array.length; i++) { 
			
			if (array[i]==0){
				
				countOfZeros++;
				
			}
		}
		for (int i = 0; i < array.length; i++) { 
			
			if (countOfZeros>i){
				
				array[i]=0;
				
			}else{
				array[i]=1;
			}
		}
		System.out.println(countOfZeros);
		
		for (int i : array) {
			System.out.print(i+",");
			
		}
	}
	
	//solution 2
		private static void solution2(int[] array, int countOfZeros) {
			for (int i = 0; i < array.length; i++) { 
				
				if (array[i]==0){
					
					array[i]=0;
					countOfZeros++;
					
				}else{
					array[i]=1;
				}
			}
			
			for (int i : array) {
				System.out.println(i);
				
			}
		}
		
		
}
