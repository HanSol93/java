
class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	double getDistance (int x1, int y1) {
		return getDistance (x, y, x1, y1);
	}
	// �������� �Ÿ� ���ϴ� ���� �ҷ��ͼ� �������� ������ ���� ����

	// (x,y) (x1,y1) . �� �� �� ���� �Ÿ��� ���Ѵ�
	static double getDistance(int x, int y, int x1, int y1) {
		int a = x - x1;
		int b = y - y1;
		
		return Math.sqrt(a*a+b*b);// �������� �Ÿ� ���ϴ� ����
	}
}

class Ex6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p (2,2) . �� �� �Ÿ��� ���Ѵ�
		System.out.println(p.getDistance(2, 2));
	}
}
