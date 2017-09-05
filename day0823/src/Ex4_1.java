
public class Ex4_1 {

	public static void main(String[] args) {
		int x = 0;
		char ch = 'x';
		int year = 400;
		boolean powerOn = false;
		String str = "yes";

		// 1
		if (x >= 10 && x <= 20) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// 2
		if (ch == ' ' || ch == '\t') {
			System.out.println(false);
		} else {
			System.out.println(true);
		}

		// 3
		if (ch == 'x' || ch == 'X') {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		// 4
		if ('0' <= ch && ch <= '9') {
			System.out.println(true);

		} else {
			System.out.println(false);
		}

		// 5
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
		//6
		if (year % 400 == 0 && year % 4 == 0 ) {
			System.out.println(true);
		} 
		if (year % 100 == 0) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
		
		//7
		if(!powerOn) {
			System.out.println("1." +true);
		}
		
		//8
		if(str == "yes") {
			System.out.println(true);
		}
		
	}

}
