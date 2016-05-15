package mnq.naqui;

import java.lang.reflect.Array;

public class SampleExperiment {

	public static void main(String[] args) {
		
		int array[]={1,8,5,7,10,9,2};
		
		int firstmax=array[0];

		int secondmax=array[1];

		int temp;
		
		if(firstmax<secondmax)

		{

		temp=secondmax;

		secondmax=firstmax;

		firstmax=temp;

		}
		
		for(int i=0;i<7;i++)

		{

		if(firstmax<array[i])

		{

		secondmax=firstmax;

		firstmax=array[i];

		}

		if((firstmax>array[i])&&(array[i]>secondmax))

		{

		secondmax=array[i];

		}

		}
System.out.println(secondmax);
	}
}
