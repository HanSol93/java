import java.util.*;

class Ex4_14 {

	public static void main(String[] args) {
		// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = 0;
		int input = 0; // 입력을 저장한 공간
		int count = 0; // 시도횟수를 세기위한 변수

		answer = (int) (Math.random() * 100) + 1; // 1~100사이의 임의의 수를 저장
		Scanner s = new Scanner(System.in);

		do {
			count++;
			System.out.print("1과  100사이의 값을 입력하세요 :");
			input = s.nextInt();

			if (input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (input > answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}
		} while (input != answer); 
		System.out.println("맞췄습니다.");
		System.out.println("시도횟수는 " + count + "번입니다.");

	}

}
