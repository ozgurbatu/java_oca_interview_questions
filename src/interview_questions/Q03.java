package interview_questions;

import java.util.Scanner;

public class Q03 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Count the words in a String one by one Girilen bir String'deki kelimeleri tek
		 * tek saydiran java code create ediniz.
		 * 
		 * For Example: Input : String is "Ali came to school and Ayse came to school"
		 * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 */

		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine();

		String arr[] = str.split(" ");
		String con = "";

		for (int i = 0; i < arr.length; i++) {
			int sayac = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					sayac++;

				}
			
			}
			if (!con.contains(arr[i])) {
				con += arr[i] + "=" + sayac + " ";
			}
		}
		System.out.println(con);

	}

}
