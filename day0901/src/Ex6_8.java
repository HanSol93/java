
class Ex6_8 {

	public static void change(String str) {
		str += "ABC123";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("After change:" + str);
	}

}
