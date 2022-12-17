//RECURSION (methods that can calls itself only)
public class Recursion {

	public static void main(String[] args) {

		Recursion o = new Recursion();
		int x = o.sum(10);
		System.out.println("sum of " + x);

	}

	int sum(int a) {
		if (a > 0) {
			System.out.println(a);
			return a + sum(a - 1);

		} else {
			return 0;
		}
	}
}
