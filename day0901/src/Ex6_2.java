
class SutdaCard {
	int num; // intŸ�� num �������
	boolean isKwang; // booleanŸ�� isKwang �������

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