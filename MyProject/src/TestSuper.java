//super keyword(target super class var,method,const)
class A1 {
//	int a = 10;		//instance var
	
	void tg() {
//		System.out.println("super class method");
	}
	
	A1(){
		System.out.println("super class const");
	}
}

class B1 extends A1 {
//	int a = 20;		//local var
	void show() {
//		System.out.println("super class variable "+super.a);
//		System.out.println("sub class variable "+a);
	}
	
	void tg1() {
//		super.tg();
//		System.out.println("sub class method");
	}
//	
//	B1(){
//		System.out.println("sub class const");
//	}
}

public class TestSuper {

	public static void main(String[] args) {
		B1 oB = new B1();			/*its call default super class const with help of the 
									Inheritance without creating super class object.8*/
//		oB.show();
		
//		oB.tg1();


	}

}
