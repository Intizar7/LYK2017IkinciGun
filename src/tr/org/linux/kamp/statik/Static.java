package tr.org.linux.kamp.statik;


public class Static {


	public static String myStaticString = "BU BİR STATİK STRING";

	public static String myStaticStringMethod() {
		return "BU BIR STATIK METOD";
	}
	
	static {
		System.out.println("bu bir statik blok");
	}
	static {
		System.out.println("bu da bir statik blok");
	}
	static {
		int x = 5;
		System.out.println(x);
		System.out.println("bu da üçüncü statik blok");
	}
}
