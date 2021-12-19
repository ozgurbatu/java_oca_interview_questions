package interview_questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Q07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		Fibonacci dizisi create ediniz.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac adet fibonacci dizisi olusturmak istersiniz");
		int sayi=scan.nextInt();
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(1);
		
		int con=0;
		while ((sayi-2)>0) {
			
			con=(list.get(list.size()-1)+list.get(list.size()-2));
			list.add(con);
			sayi--;
		}
		
		System.out.println(list);
		
		
		

	}

}
