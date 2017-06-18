package mnq.naqui;

import java.util.HashSet;
import java.util.Iterator;

public class Prime_check_My_Logic {

	public static void main(String[] args) {
		int num = 37;
		HashSet<Integer> set =new HashSet<>();
		for (int i = 2; i <=num; i++) {
			for (int j = 2; j <= num; j++) {
				if(i%j==0){
					set.add(i);			
				}
			}

		}
		System.out.println(set);
		Iterator<Integer> it =set.iterator();
		
		while(it.hasNext()){
			if((int)it.next()%2==0)
			System.out.print(it.next()+" ");
		}
	}
}


