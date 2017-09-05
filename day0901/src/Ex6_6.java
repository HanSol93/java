
class Ex6_6 {
	int x;
	int y;

	// (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
	static double getDistance(int x, int y, int x1, int y1) {
		int a = x - x1;
		int b = y - y1;
		
		return Math.sqrt(a*a+b*b);
	}

	public static void main(String args[]) {
		System.out.println(getDistance(1, 1, 2, 2));
	}

}
