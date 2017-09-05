
public class Ex5_11 {

	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 }, 
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
				};
		//과목별 점수
		int korTotal = 0, engTotal = 0, mathTotal = 0, allTotal =0;
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			int sum = 0; //개인별 총점
		
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2]; 
			
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];

				allTotal += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			System.out.printf("%5d", sum);

			System.out.println();
		}
		System.out.printf("%5d %4d %4d %4d%n",korTotal, engTotal, mathTotal, allTotal); //<총점
		

	}

}
