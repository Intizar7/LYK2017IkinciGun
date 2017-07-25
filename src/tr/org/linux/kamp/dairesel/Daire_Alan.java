package tr.org.linux.kamp.dairesel;

import java.util.*;
public class Daire_Alan {

	public static double getValue(double r) {
		return (4.0/3.0*Math.PI*r);
	}
private static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
	System.out.println("Yarıcapi gir:");
	double r=input.nextDouble();
	System.out.println("Alan:"+getValue(r));
}

}
