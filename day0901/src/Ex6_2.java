
class SutdaCard {
	int num; // int타입 num 멤버변수
	boolean isKwang; // boolean타입 isKwang 멤버변수

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int a, boolean b) {
		num = a;
		isKwang = b;
	}
	
	String info() {
		if(isKwang==true) {
			return num+"K";
		}else {
			return num+"";
		}	
	}
}

class Ex6_2 {
	public static void main(String args[]) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}