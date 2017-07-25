package tr.org.linux.kamp.ornek;

import java.util.*;

public class DiceGame {

	private static Random rgen = new Random();

	public static void main(String[] args) {
		Scanner sc = new Scanner("Ilk oyuncunun ismi:");
		String user1 = sc.next();
		Scanner sc1 = new Scanner("Ikinci oyuncunun ismi:");
		String user2 = sc.next();

		int dice1 = roll();
		int dice2 = roll();
		System.out.println("Birinci oyuncunun zari:" + dice1);
		System.out.println("Ikinci oyuncunun zari:" + dice2);
		String winner = "";
		if (dice1 > dice2) {
			winner = user1;
		} else if (dice1 == dice2) {
			winner = "Beraber";
		} else {
			System.out.println("Kazanan:" + winner);
		}
	}

	/* winner =(dice1>dice2)?user1:(dice1==dice2)?"Beraber":user2; */
	public static int roll() {
		return rgen.nextInt(6) + 1;
	}
}
