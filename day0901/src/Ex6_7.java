
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
	// 두점사이 거리 구하는 공식 불러와서 두점값을 구한후 값을 리턴

	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) {
		int a = x - x1;
		int b = y - y1;
		
		return Math.sqrt(a*a+b*b);// 두점사이 거리 구하는 공식
	}
}

class Ex6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p (2,2) . 와 의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}
}
