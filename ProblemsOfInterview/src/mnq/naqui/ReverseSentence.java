package mnq.naqui;


public class ReverseSentence {

	public static void main(String[] args) {
		String[] words="All the Best ; Do Well . ".split(" ");
		String rev="";
		
		for (int i = words.length-1; i >=0; i--) {
					rev =rev + words[i] + " ";	
		}
		System.out.println(rev);
	}

}
