package tr.org.linux.kamp.math;

import java.util.*;

public class Math_Hazir_Kutuphaneler {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Max Number:" + Math.max(10, 5));
		System.out.println("Min Number:" + Math.min(20, 3));
		System.out.println("Karakök:" + Math.sqrt(9));

		int sayi;
		System.out.println("Bir sayi giriniz:");

		boolean isPrime = true;
		int num = input.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "\t Asal  Sayi.");
		} else {
			System.out.println(num + "\t Asal Sayi Degil.");
		}
		System.out.println("" + Math.random());
		Random rgen = new Random();
		System.out.println("Rent Random next int:" + rgen.nextInt());
		System.out.println("Rent Random next double:" + rgen.nextDouble());
		System.out.println("Rent Random next boolean:" + rgen.nextBoolean());
		System.out.println("Rent Random next float:" + rgen.nextFloat());

		Random rgen1 = new Random(5);

		System.out.println("rgen1 random next int:" + rgen1.nextInt());

		int result = rgen.nextInt(2) + 8;
		System.out.println("Rgen random next int boolean 8-10" + result);
		
	}

}
