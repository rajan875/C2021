/////////////////////////Simple Inheritance
//class A {
//	int id;
//	String name;
//	String city;
//
//	void disp() {
//		System.out.println("student details ");
//	}
//}
//
//class B extends A {
//	int marks;
//
//	void show() {
//		id = 10;
//		name = "raju";
//		marks = 85;
//		city = "navi-mumbai";
//		System.out.println(id + " " + name + " " + city + " " + marks);
//	}
//}

///////////////////////////single inheritance using const.
//class student{
//	int rollno,marks;
//	String name;
//	
//	public void disp1() {
//		System.out.println("student records");
//	}
//
//}
//class raj extends student{
//	String div;
//	
//	raj() {					
//		rollno=1;marks=80;name="raj"; div="A";
//		
//	}
//	static void disp2() {
//		System.out.println("raj records");
//	}
//	void show1() {
//		System.out.println(rollno+" "+name+" "+marks+" "+div);
//	}
//
//}

/////////////////////////////Multilevel Inheritance
//class A{
//	int a=200;
//	int b=150;
//	int c;
//
//	void add() {
//		c=a+b;
//		System.out.println("sum of two no: "+c);
//	}
//	void sub() {
//		c=a-b;
//		System.out.println("sub of two no: "+c);
//	}
//	
//}
//class B extends A{
//	void mul() {
//		c=a*b;
//		System.out.println("mul of two no: "+c);
//	}
//	void div() {
//		c=a/b;
//		System.out.println("div of two no: "+c);
//	}
//	
//}
//class c extends B{
//	void rem() {
//
//		c=a%b;
//		System.out.println("rem of two no: "+c);
//
//	}
//	
//}

///////////////////////////Hierarchical Inheritance
//class Person{
//	int id;
//	int salary;
//	int rollno;
//	int dept_id;
//	String name;
//	String city;
//
//}
//class Student extends Person{
//	void std() {
//		rollno =10;
//		name="rajan";
//		city="mumabi";
//		System.out.println("Student details");
//		System.out.println(rollno+" "+name+" "+city);
//	}
//}
//class Employee extends Person{
//	void emp() {
//		id=1;
//		name="abhi";
//		salary=20000;
//		city="thana";
//		dept_id=101;
//		System.out.println("Employee details");
//		System.out.println(id+" "+name+" "+" "+salary+" "+city+" "+dept_id);
//		
//	}
//}
//class Teacher extends Person{
//	void tech() {
//		id=11;
//		name="anil";
//		salary=15000;
//		city="dombivali";
//		System.out.println("Teacher details");
//		System.out.println(id+" "+name+" "+salary+" "+city);
//	}
//}

public class TestInheritance {

	public static void main(String[] args) {

//		B oB=new B();
//		oB.disp();
//		oB.show();

//		raj oRaj=new raj();
//		oRaj.disp1();
//		raj.disp2();
//		oRaj.show1();

//		C oC =new C();
//		oC.add();
//		oC.sub();
//		oC.mul();
//		oC.div();
//		oC.rem();

//		Student oStudent=new Student();
//		oStudent.std();
//		Employee oEmployee=new Employee();
//		oEmployee.emp();
//		Teacher oTeacher=new Teacher();
//		oTeacher.tech();
	}

}
