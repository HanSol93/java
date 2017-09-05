
class Ex4_15 {

	public static void main(String[] args) {

		int number = 78987;
		int tmp = number;

		int result = 0; // 변수 number를 거꾸로 변환해서 답을 변수 result에 저장

		System.out.println(number);
		for (int i = 1; i <= 5; i++) {
			result=result*10+tmp%10;
			tmp /=10;
		}

		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");

	}

}
