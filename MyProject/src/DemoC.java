// creating method
public class DemoC {

	static void myMethod() { // create method
		System.out.println("simple method calling");
	}

	static void myMethod1(String name, int age, String city) { // passing parameter
		System.out.println("hello your name is: " + name + " " + age + " " + city);
	}

	public static void main(String[] args) {

		myMethod(); // calling method

		myMethod1("rajan", 22, "mumbai"); // passing argument
		myMethod1("mahesh", 25, "navi-mumbai");
	}

}
