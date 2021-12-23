package interview_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		/*
		 * Create a list by getting the list elements from user if there is duplicated
		 * elements remove them from the list. ​ Kullanıcıdan aldıgınız elemanlardan
		 * oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
		 */
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Lutfen kac adet sayi girmek istediginizi giriniz");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Lutfen " + i + ". tamsayi sayiyi giriniz");
			int sayi = scan.nextInt();
			list.add(sayi);
		}

		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(i);
					i--;
				}

			}

		}
		System.out.println("Listenizde yazdiginiz tekrarli sayilar silinmis hali ile : " + list);
	
	
}

}
