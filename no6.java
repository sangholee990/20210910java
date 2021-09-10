package javatest1;

import java.util.Scanner;

public class main {
	
	

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		int n=in.nextInt();
		
		int b= n%10;
		int a=1;
		
		if(n>=10) {
			a=n/10;
			if(n%10 == 0) {
				b = -1;
			}
		}
		
		System.out.print("박수");
		if(a%3==0)
		   System.out.print("짝");
		if(b%3==0)
		   System.out.print("짝");
		
		in.close();
		
		
		
	}

}
