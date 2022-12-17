// static block execute first then instance block then const. block
public class StaticBlock {

	public static void main(String[] args) {
		StaticBlock oBlock = new StaticBlock();
		shows();
		oBlock.show();

	}

	StaticBlock() {
		System.err.println("heloo anil");
	}

	{
		System.out.println("hello arjun");
	}
	static {
		System.out.println("hello rajan");
	}

	void show() {
		System.out.println("hello omkar");
	}

	static void shows() {
		System.out.println("hello ram");
	}

}
