public class MyClass {
	int eno;
	String name;
	String city;

//	public static void main(String[] args) {
//		System.out.println("hello rajan");
//		MyClass o=new MyClass();
//		System.out.println(o.eno);
//		System.out.println(o.name);
//		System.out.println(o.city);
//	}
	public MyClass(int eno, String name, String city) {
		super();
		this.eno = eno;
		this.name = name;
		this.city = city;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
