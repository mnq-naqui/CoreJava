package mnq.naqui;


//An array consists of 1 and zeros arrange the arrange the array such that it contains all
//the zeros after that all the ones

public class InfyQue {

	public static void main(String[] args) {
	int [] array={1,0,1,1,0,1,1,0,0,1};
	int [] b=null;
	int j=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==0) {
				b[j]=array[i];
				j++;
			}
			
		}
		
			}
}
