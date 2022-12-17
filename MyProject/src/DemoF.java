//variable in java
public class DemoF {
	int b = 20; // instance variable
	static int c = 30; // static variable

	public static void main(String[] args) {
		int a = 10; // local variable
		System.out.println(a);

		DemoF o = new DemoF();
		System.out.println(o.b);

		System.out.println(DemoF.c);
		System.out.println(c);

	}

}
