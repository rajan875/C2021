//Java Constructors(const_name is always same as class_name)

//class DemoA {
//	int x;
//	String name;
//	String city;
//	boolean val;
//
//	DemoA() { // user define constructor
//		x = 15;
//		name = "rajan";
//		city = "mumbai";
//		val = true;
//	}
//
//	public static void main(String[] args) {
//
//		DemoA o = new DemoA();
//		System.out.println(o.x);
//		System.out.println(o.name);
//		System.out.println(o.city);
//		System.out.println(o.val);
//
//	}
//
//}

//class DemoA{				//default constructor(its automatically generate constructor at compile time) 
//	int x;
//	String name;
//	String city;
//	boolean val;
//	
//	public static void main(String args[]) {
//		DemoA o=new DemoA();
//		System.out.println(o.x+o.name+o.city+o.val);
//	}
//}

//Copy Constructor
//class DemoA {
//	int id;
//	String name;
//	String city;
//
//	DemoA(int a, String b) {
//		id = a;
//		name = b;
//	}
//
//	DemoA(DemoA objA) {
//		id = objA.id;
//		name = objA.name;
//	}
//
//	void display() {
//		System.out.println(id + " " + name);
//	}
//
//	public static void main(String args[]) {
//		DemoA o1 = new DemoA(1, "rajan");
//		DemoA o2 = new DemoA(o1);
//		DemoA o3 = new DemoA(2, "om");
//		DemoA o4 = new DemoA(o3);
//
//		o1.display();
//		o2.display();
//		o3.display();
//		o4.display();
//
//	}
//
//}

class DemoA {
	int id;
	String name;
	String city;

	DemoA(int a, String b) {
		id = a;
		name = b;
	}

	DemoA(DemoA obj) {

	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		DemoA o1 = new DemoA(1, "rajan");
		DemoA o2 = new DemoA(o1);
		o2.id = o1.id;
		o2.name = o1.name;

		o1.display();
		o2.display();

	}

}
