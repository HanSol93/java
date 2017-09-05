import java.util.*;

public class Ex5_13 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		char tmp = 0;
		char sum = 0;
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환
			for (int j = 0; j < question.length; j++) {
				tmp = (char) (Math.random() * question.length);
				sum = question[i];
				question[i] = question[j];
				question[j] = sum;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
			String answer = scanner.nextLine();
			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
			if (words[i].equals(answer.trim()))
				System.out.printf(" 맞았습니다.%n%n");
			else
				System.out.printf(" 틀렸습니다.%n%n");
		}

	}

}

//배운점 : char를 랜덤 돌리는것도 int랑 같다.
