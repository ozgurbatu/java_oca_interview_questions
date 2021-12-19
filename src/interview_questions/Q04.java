package interview_questions;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * From a given array find all pairs whose sum is a given number verilen bir
		 * arraydeki, toplamý belirli bir sayý olan tüm çiftleri bulun For example;
		 * input : {4, 6, 5, -10, 8, 5, 20} ==> 10 Output : 4 + 6 = 10, 5 + 5 = 10, -10
		 * + 20 = 10
		 */

		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };

		int istenenToplam = 10;
		System.out.println("Istenen toplama esit olan sayilar : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == istenenToplam) {
					System.out.println(arr[i] + " ve " + arr[j] + " = " + istenenToplam);
				}
			}

		}

	}

}
