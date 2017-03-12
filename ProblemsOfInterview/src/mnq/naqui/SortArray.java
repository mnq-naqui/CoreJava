package mnq.naqui;

public class SortArray {

	public static void main(String[] args) {

		int[] inputArray = { 2, 3, 2, 4, 5, 7, 9, 3, 5, 5, 8 };
		int[] sortArray = sortArray(inputArray);
		for (int i : sortArray) {
			System.out.println(i);
		}

	}

	public static int[] sortArray(int[] inputArray) {

		for (int i = 0; i < (inputArray.length - 1); i++) {
			for (int j = 0; j < (inputArray.length - 1); j++) {
				if (inputArray[i] > inputArray[j + 1]) {
					inputArray[i] = inputArray[j + 1];
				}
			}

		}
		return inputArray;
	}
}
