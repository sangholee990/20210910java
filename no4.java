package javatest1;

import java.util.Scanner;

public class main {
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if((a<b && b<c)||(c<b && b<a)) {
			System.out.print("중간 값은"+b);
		}
		
		else if((b<a && a<c)||(c<a && a<b)) {
			System.out.print("중간 값은"+a);
		}
		
		else {
			System.out.print("중간 값은"+c);
		}
		
		
		
		in.close();
		
		
	}

}
