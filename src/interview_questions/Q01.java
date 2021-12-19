package interview_questions;

import java.util.Scanner;

public class Q01 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Girilen bir String'i tersten yazdiran bir pr create ediniz

		System.out.println("Lutfen bir cumle giriniz");

		String str = scan.nextLine();

		System.out.println("Girdiginiz cumlenin tersten yazimi : " + terstenYazim(str));

	}

	private static StringBuilder terstenYazim(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return sb;
	}

}
