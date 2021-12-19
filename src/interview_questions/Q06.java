package interview_questions;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine();
		str = str.replace(" ", "");
		String arr[] = str.split("");
		String str2 = "";
		int sayac = 0;

		for (int i = 0; i < arr.length; i++) { // her bir elemani alacak sabitleyecek
			for (int j = i + 1; j < arr.length; j++) { // burada alinan elemanlar digerleri ile kontrol edecek
				if (arr[i].contains(arr[j])) {
					sayac++;
					if (sayac > 0 && !str2.contains(arr[i])) {
						str2 += arr[i] + " ";
					}

				}
			}
			sayac = 0;

		}
		System.out.println(str2);

	}

}
