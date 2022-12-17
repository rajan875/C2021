//method overloading
//class Ap{
//	void add() {
//		int x=10, y=20, z;
//		z=x+y;
//		System.out.println("method overloading");
//		System.out.println("sum of two no: "+z);
//		
//	}
//	void add(int x,int y) {
//		int z=x+y;
//		System.out.println("sum of two no: "+z);
//	}
//	void add(int x,float y) {
//		float z=x+y;
//		System.out.println("sum of two no: "+z);
//	}
//	void add(double x,double y) {
//		double z=x+y;
//		System.out.println("sum of two no: "+z);
//	}
//}

//method overriding(write same method in sub class) 
class Ao {
	void add(int x, int y) {
		int z = x + y;
		System.out.println("sum of two no is: " + z);
	}
}

class Bo extends Ao {
	@Override
	void add(int x, int y) {
		int z = x + y;
		System.out.println("method overriding");
		System.out.println("sum of two no: " + z);
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
//		Ap oAp=new Ap();
//		oAp.add();
//		oAp.add(10, 30);
//		oAp.add(10, 4.5);
//		oAp.add(20.65, 45.68);

		Bo oBo = new Bo();
		oBo.add(10, 35);

	}

}
