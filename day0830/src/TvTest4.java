class Tv1 {
	// Tv1�� �Ӽ� (�������)
	String color;
	boolean power;
	int channel;

	// Tv1�� ��� (�޼���)
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}

public class TvTest4 {

	public static void main(String[] args) {
		Tv1[] tvArr = new Tv1[3];
		
		for(int i=0;i<tvArr.length;i++) {
			tvArr[i]  = new Tv1();
			tvArr[i].channel = i +10;
		}
		for (int i=0;i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}

}
