// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100) + 1;
		int b = (int) (Math.random() * 100) + 1;
		int c = (int) (Math.random() * 100) + 1;
		int minHolder = Math.min(a, b);
		int smaller = Math.min(minHolder, c);
		int maxHolder = Math.max(a, b);
		int bigger = Math.max(maxHolder, c);
		int medium = a + b + c - smaller - bigger;
		System.err.println(smaller+" "+medium+" "+bigger);

	}
}
