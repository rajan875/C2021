package pack1;

public class SamA {
	public String name = "package runing another package"; // for package

	static int x = 10; // static
	int y = 20; // non-static

	public static void main(String args[]) {

		System.out.println(x); // static access

		SamA o = new SamA(); // non static access
		System.out.println(o.y);

	}

}
