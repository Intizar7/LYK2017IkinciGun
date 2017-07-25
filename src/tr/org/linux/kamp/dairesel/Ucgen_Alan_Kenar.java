package tr.org.linux.kamp.dairesel;

import java.util.*;

public class Ucgen_Alan_Kenar {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double kenar1, kenar2, taban, yukseklik, uzunluk, uCevre, uAlan;
		System.out.println("Kenar 1:");
		kenar1 = input.nextDouble();
		System.out.println("Kenar 2:");
		kenar2 = input.nextDouble();

		System.out.println("Cevre:" + Cevre(kenar1, kenar2, HipHesapla(kenar1, kenar2)));
		System.out.println("Alan:" + Alan(kenar1, kenar2));
		System.out.println("Hipatenus Bul:" + HipHesapla(kenar1, kenar2));

	}

	private static double Cevre(double a, double b, double c) {
		double cevre = a + b + c;
		return cevre;
	}

	private static double Alan(double a, double b) {
		double alan = (a + b) / 2;
		return alan;
	}

	private static double HipHesapla(double m, double n) {
		return Math.hypot(m, n);
	}
}
