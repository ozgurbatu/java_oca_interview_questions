package interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value, 
		decreasing constantly after the maximum value
		Not Mauntain Array--> [5, 2, 7, 1, 4] 

		Bir array elemanlari en buyuk degerine kadar surekli artan, 
		en buyuk degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Gireceginiz sayi adetini giriniz ");
		int adet = scan.nextInt();

		for (int i = 1; i <= adet; i++) {
			System.out.print(i + ". sayiyi giriniz :");
			int sayi = scan.nextInt();
			list.add(sayi);
		}
		
		int sayac=0;
		int max=Integer.MIN_VALUE;
		int index=0;
		
		for (int i = 0; i < list.size(); i++) { // max degeri ve onun bulundugu indexisi bulduk
			if (max<list.get(i)) {
				max=list.get(i);
				index=i;
			}
		}
		for (int i = 0; i < index ; i++) { // bastan max'in bulundugu index'e kadar tarama yapiyoruz
			if (list.get(i) < list.get(i + 1)) {
				continue;
			} else {
				sayac++;
				break;
			}

		}

		for (int i = index; i < list.size() - 1; i++) { // max'in bulundugu index'ten en son elemena kadar kontrol yapiyoruz
			if (list.get(i) > list.get(i + 1)) {
				continue;
			} else {
				sayac++;
				break;
			}

		}
		
		Object[] arr=list.toArray(); //array'e atanmis oldu :)
		
		if (sayac==0) {
			System.out.println(Arrays.toString(arr)+" Mauntain Array'dir ");
		} else {
			System.out.println(Arrays.toString(arr)+" Mauntain Array degildir ");
		}
		

	}

}
