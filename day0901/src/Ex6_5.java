class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student1(String a, int b, int c, int d, int e, int f) {
		name = a;
		ban = b;
		no = c;
		kor = d;
		eng = e;
		math = f;
	}

	String info() {
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+ math+", "+ (kor + eng + math + ", ")
				+ (Math.round((float)(kor + eng + math) / 3 * 10) / 10d);
	}
}

public class Ex6_5 {

	public static void main(String[] args) {
		Student1 s = new Student1("ȫ�浿",1,1,100,60,76);
		System.out.println(s.info());
	}

}
