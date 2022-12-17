/*interface*/

/*
import java.util.Scanner;

interface client {		//client requ. 
	
	void input();

	void output();
}

class Rajan implements client {
	String name;
	double salary;

	public void input() {
		System.out.println("Enter name");
		Scanner oScanner = new Scanner(System.in);
		name = oScanner.nextLine();
		System.out.println("Enter salary");
		salary = oScanner.nextDouble();
	}

	public void output() {
		System.out.println(name + " " + salary);

	}

}
*/

//variable=public+static+final
/*
interface customer{
	int amount=10000;
	
}
class service implements customer{
	void show() {
		amount=20000;			//it can't be change because of its a final variable
		System.out.println("customer needs amount is: "+amount);
	}
}
*/

//method=public+abstract
interface clientreq {
	void webdesing(); // in interface method is public

	void webdevlopment(); // in interface method is public
}

abstract class anil implements clientreq { // anil do only webdesing part he dont know the webdevlopment part
	@Override // abstract using because he done only one part
	public void webdesing() {
		System.out.println("heading, menu, footer");
	}
}

class raj extends anil {
	@Override
	public void webdevlopment() {
		System.out.println("html,css,javascript");
	}
}

public class TestInterface {

	public static void main(String[] args) {
//		Rajan oRajan = new Rajan();
//		oRajan.input();
//		oRajan.output();

//		service oService=new service();
//		oService.show();

		raj oRaj = new raj();
		oRaj.webdesing(); // its mean method is public if not then raj can't access anil method
		oRaj.webdevlopment();
	}

}
