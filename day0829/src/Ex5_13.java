import java.util.*;

public class Ex5_13 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		char tmp = 0;
		char sum = 0;
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ
			for (int j = 0; j < question.length; j++) {
				tmp = (char) (Math.random() * question.length);
				sum = question[i];
				question[i] = question[j];
				question[j] = sum;
			}
			System.out.printf("Q%d. %s�� ������ �Է��ϼ���.>", i + 1, new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] ���� �� �¿� ������ ������ �� �� �� ��
			if (words[i].equals(answer.trim()))
				System.out.printf(" �¾ҽ��ϴ�.%n%n");
			else
				System.out.printf(" Ʋ�Ƚ��ϴ�.%n%n");
		}

	}

}

//����� : char�� ���� �����°͵� int�� ����.
