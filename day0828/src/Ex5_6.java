
public class Ex5_6 {

	public static void main(String[] args) {
		// . ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680; /*�ٵ�*/
		int sum = 0; /*�ص�*/

		System.out.println("money=" + money);
		for (int i = 0; i < coinUnit.length; i++) {	
			sum = money/coinUnit[i]; //�ٵ� ������ ������ �ص�
			money = money%coinUnit[i]; //�ٵ� ������ ������ �ٵ�
			
			System.out.println(coinUnit[i]+"�� : "+sum);
		}

	}

}
