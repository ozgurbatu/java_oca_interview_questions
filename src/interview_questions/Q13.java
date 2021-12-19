package interview_questions;

public class Q13 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to swap two numbers
		 * 
		 * Swap (takas) islemini --> a=3, b=5 iken a=5, b=3 degerlerini almasý
		 * islemidir. iki yoldan yaptiginiz java kodunu yaziniz. 1.Yol: 3. degisken
		 * kullanarak 2.Yol: 3. degisken kullanmadan
		 */
		// 1. YOL
		int a = 3;
		int b = 5;
		int c = 0;
		c = a;
		a = b;
		b = c;
		System.out.println("a : " + a + " b : " + b);

		// 2. YOL

		int x = 3;
		int y = 5;

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x : " + x + " y : " + y);

	}

}
