//not using try and catch block
class exp1 {
	void test1() {
		int x = 10, y = 0, z;
		z = x / y;
		System.out.println(z);
	}
}

//using try and catch block
class exp2 {
	void test2() {
		int a = 10, b = 0, c;

		try {
			System.out.println("stating exception");
			c = a / b;
			System.out.println(c);

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("somthing wrong"); // write any mess..
		}
	}
}

public class TestException {

	public static void main(String[] args) {

//		exp1 oExp1=new exp1();
//		oExp1.test1();

		exp2 oExp2 = new exp2();
		oExp2.test2();

	}

}
