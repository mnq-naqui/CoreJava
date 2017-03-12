package mnq.naqui;

import java.util.Arrays;

public class BubbleSortDescendingOrder {
	 
    public static void main(String[] args) {
           
            //create an int array we want to sort using bubble sort algorithm
            int intArray[] = new int[]{11,230,90,35};
           
            //print array before sorting using bubble sort algorithm
            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < intArray.length; i++){
                    System.out.print(intArray[i] + " ");
            }
           
            //sort an array in descending order using bubble sort algorithm
            bubbleSort(intArray);
           
            System.out.println("");
           
            //print array after sorting using bubble sort algorithm using Array's overrided toString method.
            System.out.println( Arrays.toString(intArray));

    }

    private static void bubbleSort(int[] intArray) {
           
            /*
             * In bubble sort, we basically traverse the array from first
             * to array_length - 1 position and compare the element with the next one.
             * Element is swapped with the next element if the next element is smaller.
             *
             * Bubble sort steps are as follows.
             *
             * 1. Compare array[0] & array[1]
             * 2. If array[0] < array [1] swap it.
             * 3. Compare array[1] & array[2]
             * 4. If array[1] < array[2] swap it.
             * ...
             * 5. Compare array[n-1] & array[n]
             * 6. if [n-1] < array[n] then swap it.
             *
             * After this step we will have smallest element at the last index.
             *
             * Repeat the same steps for array[1] to array[n-1]
             *  
             */
           
            int temp = 0;
           
            for(int i=0; i < intArray.length; i++){
                    for(int j=1; j <intArray.length; j++){
                           
                            if(intArray[j-1] < intArray[j]){
                                    //swap the elements!
                                    temp = intArray[j-1];
                                    intArray[j-1] = intArray[j];
                                    intArray[j] = temp;
                            }
                           
                    }
            }
   
    }
}

