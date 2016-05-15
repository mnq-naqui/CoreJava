package mnq.naqui;

import java.util.ArrayList;
import java.util.List;

public class StringProblem3 {

	public static void main(String[] args) {
		//Que--> Count no. of occurence of development
		String str=
				"Involved in the development of different modules of this project Done a few changes in the applications according to the n requirement during the enhancement. Developed the Application using Spring MVC Framework by implementing Controller, Service classes.Interaction with the client Development Team  technical requirement clarifications and resolving technical requirement issuesWork with client development team to determine the areas of improvements and implement the same.Fix defects with low, medium and high priority.Developed various Java beans  performance of business processes and effectively involved in Impact analysis.	Involved in creating various Data Access Objects addition,modification and deletion of records using various specification files and Involved inInversion of Control development.Developed various helper classes needed following Core Java multi-threadedprogramming and Collection classes.".toLowerCase();
		String dev = "development";
		char[] input = str.toCharArray();
		/*for (char c : input) {
			System.out.println(c);
		}*/
		//
		String temp="";
		int count =0;
		for (int i = 0; i < input.length; i++) {
//			System.out.println(input[i] != ' ');
			if(input[i] != ' '){
				temp = temp + input[i];
//				System.out.println(temp);
			} else {
				if(temp.equalsIgnoreCase(dev)){
					count++;
				}
				temp ="";
			}
		}
		System.out.println(count);
		
		/*String [] str1=str.split(" ");
		String s1="development";
		int count =0;
		for (String string : str1) {
			System.out.println(string);
			if (string.equals(s1)) {
				count++;
			}
		}*/
//		System.out.println(count);
        /*String[] splitStr = str.split(" ");
        int  count1 = 0;
        
        List<String> list = new ArrayList<>();
        for(String s:splitStr){
            if(!list.contains(s)){
                list.add(s);
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<splitStr.length;j++){
                if(list.get(i).equals(splitStr[j])){
                    count1++;
                }
            }
            System.out.println("Occurrence of " + list.get(i) + " is " + count + " times.");
            count1=0;
        }*/
	}

}
