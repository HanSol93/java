import java.util.*;

class Ex4_14 {

	public static void main(String[] args) {
		// 1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = 0;
		int input = 0; // �Է��� ������ ����
		int count = 0; // �õ�Ƚ���� �������� ����

		answer = (int) (Math.random() * 100) + 1; // 1~100������ ������ ���� ����
		Scanner s = new Scanner(System.in);

		do {
			count++;
			System.out.print("1��  100������ ���� �Է��ϼ��� :");
			input = s.nextInt();

			if (input < answer) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (input > answer) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		} while (input != answer); 
		System.out.println("������ϴ�.");
		System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");

	}

}
