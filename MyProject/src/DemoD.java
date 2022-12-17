//void and non void methods
public class DemoD { // using void
	static void myMethod(int x) {
		System.out.println(10 + x);
	}

	static int myMethod1(int x, int y) { // not void
		return x + y + 10;
	}

	static int myMethod2(int x, int y) {
		return x * y + 10;
	}

	public static void main(String args[]) {
		myMethod(30);
		System.out.print(myMethod1(20, 30));
		int z = myMethod2(5, 4); // store value in variable
		System.out.println(z);
	}

}
