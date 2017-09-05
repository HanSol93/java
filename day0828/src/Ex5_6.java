
public class Ex5_6 {

	public static void main(String[] args) {
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680; /*줄돈*/
		int sum = 0; /*준돈*/

		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {	
			sum = money/coinUnit[i]; //줄돈 나누기 동전은 준돈
			money = money%coinUnit[i]; //줄돈 나머지 동전은 줄돈
			
			System.out.println(coinUnit[i]+"원 : "+sum);
		}

	}

}
