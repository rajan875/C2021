//string methods(immutable)

//public class Str {
//	static String x = "rajan ";
//
//	public static void main(String[] args) {
//
//		System.out.println(x);
//
//		x.concat(" prajapati"); // its can't change the values of a
//		System.out.println("not change: " + x);
//
//		x = x.concat("prajapati"); // its possible using assignment operator
//		System.out.println("change: " + x);
//	}
//}

//types of string methods

//public class Str {
//	
//	public static void main(String[] args) {
//
//		String a = "RAJAN ";
//		String b = "prajapati";
//		String c = "     raj     ";
//		String d = "";
//		String e = "rakan";
//
//		System.out.println(a.toLowerCase());
//		System.out.println(b.toUpperCase());
//
//		System.out.println(a.concat(b.toUpperCase()));
//		System.out.println(b.length());
//
//		System.out.println(c.trim());
//		System.out.println(d.isEmpty());
//
//		System.out.println(a.charAt(2));
//		System.out.println(b.indexOf("i"));
//
//		System.out.println(b.equals(a));
//		System.out.println(e.replace("k", "j"));
//
//	}
//}

// string reverse methods

public class Str {

	public static void main(String[] args) {
		String a = "rajan prajapati";

		StringBuffer oBuffer = new StringBuffer(a);
		System.out.println(oBuffer.reverse());

		StringBuilder oBuilder = new StringBuilder(a);
		System.out.println(oBuilder.reverse());

	}

}
