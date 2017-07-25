package tr.org.linux.kamp.dairesel;

import java.util.*;

public class Dairesel_Islemler {
	private static double x;
	private static Random rgen = new Random();

	public static void main(String[] args) {

		double dartcount = 10000;
		int insidecount = 0;

		for (int i = 0; i <= dartcount; i++) {
			if (isInCircle(getPoint(), getPoint())) {
				insidecount++;
			}
		}
		double pi = 4 * (insidecount * 1.0 / dartcount);
		System.out.println(pi);

	}

	public static double getPoint() {
		return (2 * rgen.nextDouble()) - 1;
	}

	public static boolean isInCircle(double x, double y) {
		return Math.pow(x, 2) + Math.pow(y, 2) < 1;

	}

}