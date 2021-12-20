package interview_questions;

import java.util.ArrayList;
import java.util.List;

public class Q14 {

	public static void main(String[] args) {
		/*
		 * /* If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 } type a program to create
		 * a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }
		 * 
		 * Verilen bir arayýn elemanlarýnýn ardýþýk artan toplamýný hesaplayýp yeni bir
		 * array'a atayan bir program cretae ediniz..
		 * 
		 * input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		 * 
		 * output : { 3, 5+1, 2+7+9, 2+3+5+7 }
		 * 
		 */

		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };

		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			a.add(arr[i]);
		}
		List<Integer> b = new ArrayList<>();
		int d = 1;
		int top = 0;
		int p = 0; // cagiracagim elemanlari artirmak icin

		for (int satir = 0; satir < 4; satir++) {
			for (int j = 0; j < d; j++) { 
				top += a.get(p++); 

			}
			d++;
			b.add(top);
			top = 0;
		}

		System.out.println(b);

	}

}
