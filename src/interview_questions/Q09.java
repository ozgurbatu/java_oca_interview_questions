package interview_questions;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		/*
		 * Ask user enter a positive number and check if it is prime or not
		 * 
		 * Kullanýcýdan pozitif bir sayý girmesini isteyin ve asal olup olmadýðýný
		 * kontrol edin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tamsayi sayi giriniz");
		int sayi = scan.nextInt();
		int sayac = 0;
		if (sayi > 0) {
			for (int i = 2; i < sayi; i++) {
				if (sayi % i != 0) {
					continue;

				} else {
					sayac++;
					break;

				}
			}
		} else {
			System.out.println("lutfen pozitif bir tamsayi giriniz");
		}

		if (sayac == 0) {
			System.out.println("Girdiginiz sayi asal sayidir");
		} else {
			System.out.println("Girdiginiz sayi asal sayi degildir");
		}

		scan.close();

	}

}
