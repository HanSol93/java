
class Ex4_15 {

	public static void main(String[] args) {

		int number = 78987;
		int tmp = number;

		int result = 0; // ���� number�� �Ųٷ� ��ȯ�ؼ� ���� ���� result�� ����

		System.out.println(number);
		for (int i = 1; i <= 5; i++) {
			result=result*10+tmp%10;
			tmp /=10;
		}

		if (number == result)
			System.out.println(number + "�� ȸ���� �Դϴ�.");
		else
			System.out.println(number + "�� ȸ������ �ƴմϴ�.");

	}

}
