package interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		/*
		 * Create a function that takes an array and returns the difference between and
		 * the smallest numbers. Ask user to enter array elements.
		 * 
		 * kullanýcýnýn girdigi bir array'in en buyuk elemani ile en kucuk elemanýnýn
		 * farkýný bulan bir method create ediniz.
		 */
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kac elemanli bir array olusturmak istediginizi giriniz");
		int eleman=scan.nextInt();
		
		int arr[]=new int[eleman];
		
		for (int i = 0; i < eleman; i++) {
			System.out.println("Lutfen "+(i+1)+". elemani giriniz");
			int sayi=scan.nextInt();
			arr[i]=sayi;
		}
		Arrays.sort(arr);
		System.out.println("Girdiginiz en buyuk eleman ile en kucuk elemanin farki : "+(arr[arr.length-1]-arr[0]));
		

	}

}
