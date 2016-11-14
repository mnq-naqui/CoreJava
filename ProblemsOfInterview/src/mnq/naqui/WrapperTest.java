package mnq.naqui;

import java.util.Arrays;
import java.util.List;

public class WrapperTest {

	public static void main(String[] args) {
		
		int temp=6;
		String integer="9";
		Integer intObj=new Integer(2);
		System.out.println("Integer object's value: "+intObj);
		int intValue = intObj.intValue();
		System.out.println("Converted to primitive from Wrapper: "+intObj);
		Integer valueOf = Integer.valueOf(intValue);
		System.out.println("Converted to Wrapper from primitive: "+intObj);
		int parseInt = intObj.parseInt(integer);
		
		
		int [] intArray={1,3,4,5,6,7};
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
		}
		System.out.println("##########################");
		List<int[]> asList = Arrays.asList(intArray);
		int []addArray={11};
		asList.add(addArray);
		for (int[] i : asList) {
			for (int j = 0; j < i.length; j++) {
				System.out.println(i[j]+" ");
			}
		}
		
	}

}
