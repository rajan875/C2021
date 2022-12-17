import java.util.Iterator;

class A {
	String name;

	A() {
		System.out.println("one");
	}

	public A(String c) {
		c = "rajan";
		name = "omkar";
		System.out.println("two " + c);
	}

	A(int a) {
		System.out.println("three");
	}

	protected A(int b, int c) {
		System.out.println("four");
	}

	static void show() {
		A oA = new A(2);
		System.out.println("five");
	}

	public void show1() {
		System.out.println("six");
	}

}

class B {
	void my() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		A oA = new A("raj");
		A.show();
		oA.show1();

		System.out.println("class b");
	}

}

public class ATest {

	public static void main(String[] args) {
		A o1 = new A();
		A o2 = new A("om");
		A o3 = new A(10);
		A o4 = new A(10, 20);

		A.show();
		o2.show1();
		System.out.println("hello main ");

		B oB = new B();
		oB.my();

	}

}
