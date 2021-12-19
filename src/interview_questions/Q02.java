package interview_questions;

import java.util.Scanner;

public class Q02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Check if the integer is an Armstrong numbers Armstrong sayi:herhangi bir
		 * sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi Armstrong
		 * sayidir ​ 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153 370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
		 */

		System.out.println("Lutfen kontrol edilmesi icin bir tam sayi giriniz");
		int num = scan.nextInt();
		int sayi = num;
		int toplam = 0;
		int rakam = 0;
		while (num > 0) {
			rakam = num % 10;
			toplam += rakam * rakam * rakam;
			num /= 10;
		}
		if (sayi == toplam) {
			System.out.println("Girdiginiz sayi Armstrong sayidir.");
		} else {
			System.out.println("Girdiginiz sayi Armstrong sayi degildir.");
		}

	}

}
