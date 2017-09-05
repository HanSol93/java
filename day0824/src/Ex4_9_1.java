
class Ex4_9_1 {
	public static void main (String[] args) {
		String src = "ABCDE";
		
		for (int i=0;i<src.length();i++) {
			char ch = src.charAt(i); // src의 i문자를 ch에 저장
			System.out.println("src.charAt("+i+"):"+ch);
		}
		//String을 char로 변환
	}
}
