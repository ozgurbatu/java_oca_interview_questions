package interview_questions;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		/*
		 * Crteate a program checks if a String is PALINDROME or not. If a word, phrase,
		 * or sequence that reads the same backword as forward then it is called
		 * "palindrome", For Example : "madam" or "nurses run" .
		 * 
		 * 
		 * Kuulanýcýnýn girdiði bir String'in PALINDROME olup olmadýðýný kontrol eden
		 * bir method create ediniz polindrome :Palindrom, tersten okunuþu da ayný olan
		 * cümle ornek : Ey edip Adana`da pide ye, Traþ niçin þart
		 */

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine();

		reverse(str);

	}

	private static void reverse(String str) {

		StringBuilder sb = new StringBuilder(str);

		sb.reverse();
		if (str.equals(sb.toString())) {
			System.out.println("String is PALINDROME");
		} else {
			System.out.println("String is not PALINDROME");
		}

	}

}
