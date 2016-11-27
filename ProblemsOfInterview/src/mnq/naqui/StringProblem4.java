package mnq.naqui;

/*WAP to print the merge and return the String in this format say s1="abc" and s2="def"
then mergeString should be "adbecf"
*/

public class StringProblem4 {

	public static void main(String[] args) {
		String s1 = "abc";
	    String s2 = "defhhh";


	    char[] c1 = s1.toCharArray();
	    char[] c2 = s2.toCharArray();

	    int lLengthc1 = c1.length;
	    int lLengthc2 = c2.length;

	    for (int i = 0; i < lLengthc1 + lLengthc2; i++) {
	      if (i < c1.length && i < c2.length)
	        System.out.print(c1[i] +"" +c2[i]);
	      else if (i < c1.length)
	        System.out.print(c1[i]);
	      else if (i < c2.length )
	        System.out.print(c2[i]);
	    }
	}

}