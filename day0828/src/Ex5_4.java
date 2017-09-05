
public class Ex5_4 {

	public static void main(String[] args) {
		int[][] arr = { { 5, 5, 5, 5, 5 }, 
					{ 10, 10, 10, 10, 10 }, 
					{ 20, 20, 20, 20, 20 }, 
					{ 30, 30, 30, 30, 30 } };
		int total = 0;
		float average = 0f;

		for (int[] tmp : arr) {
			for (int i : tmp) {
				total += i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				average = (float) total / arr.length / arr[i].length;
			}
		}

		System.out.println("total=" + total);
		System.out.println("average=" + average);
	} // end of main
} // end of class