// two class in same file
class DemoB {
	int eno;
	String name;
	String city;
	int salary;

	DemoB(int eno, String name, String city, int salary) {
		super();
		this.eno = eno;
		this.name = name;
		this.city = city;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

class TestB {

	public static void main(String[] args) {
		DemoB o1 = new DemoB(1, "omkar", "ghtkopar", 20000);
		DemoB o2 = new DemoB(2, "ram", "mulund", 25000);
		DemoB o3 = new DemoB(3, "karan", "sion", 30000);
		System.out.println(o1.eno + "\t" + o1.name + "\t" + o1.city + "\t" + o1.salary);
		System.out.println(o2.eno + "\t" + o2.name + "\t" + o2.city + "\t" + o2.salary);
		System.out.println(o3.eno + "\t" + o3.name + "\t" + o3.city + "\t" + o3.salary);
	}
}
