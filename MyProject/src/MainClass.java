public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass e1 = new MyClass(1, "rajan", "mumbai");
		MyClass e2 = new MyClass(2, "mohit", "navi-mumbai");
		MyClass e3 = new MyClass(3, "arjun", "navi-mumbai");
		System.out.println(e1.eno + "\t" + e1.name + "\t" + e1.city);
		System.out.println(e2.eno + "\t" + e2.name + "\t" + e2.city);
		System.out.println(e3.eno + "\t" + e3.name + "\t" + e3.city);
	}

}
