//Encapsulation(private data member can't be access another class)

class Enc {
	private int num = 100;
	private int x = 300;

	public void show() {
		System.out.println(num);
	}
}

class TestEncapsulation {
	private int num2 = 200;

	public static void main(String[] args) {
		TestEncapsulation oEnc = new TestEncapsulation();
		System.out.println(oEnc.num2);

		Enc oEnc1 = new Enc();
//		System.out.println(oEnc1.x);		//it can't be access direct varibale
		oEnc1.show(); // it can be access with method

	}

}
