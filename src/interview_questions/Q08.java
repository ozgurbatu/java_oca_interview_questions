package interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanýcýdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayýlarý aynýysa "Anagram" yazdýrýn,   aksi takdirde konsolda "Anagram Deðil" yazdýrýn.
		Ornek : "Pide" ve"EDÝP" anagram ifadelerdir..

		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz");
		String str=scan.next().toLowerCase();
		String arr1[]=str.split("");
		Arrays.sort(arr1);
		
		System.out.println("Lutfen kelimeleri karsilastirmak icin bir kelime daha giriniz");
		String str1=scan.next().toLowerCase();
		String arr2[]=str1.split("");
		Arrays.sort(arr2);
		
		boolean esitMi=Arrays.equals(arr1, arr2); // Arrays classindan equals method'unu kullanarak
												// esitligini kontrol ettim
		
		if (esitMi) {
			System.out.println("Girdiginiz kelimler Anagram'dir");
		} else {
			System.out.println("Girdiginiz kelimler Anagram degildir");
		}
		
		/*
		 // COZUM 2
		int sayac=0;
		if (arr1.length==arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i].charAt(0)==arr2[i].charAt(0)) {
					continue;
				} else {
					sayac++;
				}
				
			}
		} else {
			System.out.println("Girdiginiz kelimelerin uzunlugu birbirine esit olmadigi icin kontrol edilemedi");
		}
		if (sayac==0) {
			System.out.println("Girdiginiz kelimler Anagram'dir");
		}else {
			System.out.println("Girdiginiz kelimler Anagram degildir");
		}
		*/
		scan.close();

	}

}
