abstract class person { // abst. class
	abstract void details(); // abst. method dosn't contain body

	abstract void country();
}

class name extends person { // here we override two abst. method for super calss person
	@Override
	void details() {
		System.out.println("rajan");
	}

	void country() {
		System.out.println("india");
	}
}
//class city extends person{		//here we override only one abst. method for super calss person
//	@Override					//its compulsory to override two abst. method
//	void details() {
//		System.out.println("mumbai");
//	}
//}

public class TestAbstraction {

	public static void main(String[] args) {
		name oName = new name();
//		city oCity=new city();
		oName.details();
		oName.country();
//		oCity.details();
//		oCity.country();
	}

}
