package interview_questions;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter the number of lines of a half pyramid. Type a program to
		 * create the half pyramid. For exampleif the number of lines is 5, the pyramid
		  will be like;
		 
		 *
		 * * 
		 * * * 
		 * * * * 
		 * * * * *
		  
		  Kullanýcýnýn girdigi satýr sayýsý kadar yarým piramid sekli yazdýran bir
		  program create ediniz.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();

		for (int i = 0; i <= sayi; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*" + " ");

			}System.out.println();
		}
		scan.close();

	}

}
