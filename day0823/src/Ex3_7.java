
public interface Ex3_7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = 5f / 9f * (fahrenheit - 32f);
		System.out.println("Fahrenheit:" + fahrenheit);
		System.out.println("Celcius:" + (int) (celcius * 100 + 0.5) / 100.0);
	}

}
