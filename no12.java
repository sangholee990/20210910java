package practice2;

import java.util.Scanner;

public class practice2 {
	
	public static void main(String[] args) {
	
	      Scanner sc = new Scanner(System.in);
	      
	      double a, c, result;
	      String b; 
	      System.out.print("연산>>");
	      a = sc.nextInt();
	      b = sc.next();
	      c = sc.nextInt();
	      
	    
	      if(b.equals("+")) {
	         result = a + c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("-")) {
	         result = a - c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("*")) {
	         result = a * c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	      }
	      else if(b.equals("/")) {
	         if(c==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"의 계산 결과는 "+result);
	         }
	      }
	      
	      switch(b) {
	      case "+" :
	         result = a+c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	         break;
	      case "-":
	         result = a-c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	         break;
	      case "*":
	         result = a*c;
	         System.out.print(a+b+c+"의 계산 결과는 "+result);
	         break;
	      case "/":
	         if(c==0) {
	            System.out.print("0으로 나눌 수 없습니다.");
	            break;
	         }
	         else {
	            result = a / c;
	            System.out.print(a+b+c+"의 계산 결과는 "+result);
	            break;
	         }
	      default:
	         System.out.print("잘못 입력하였습니다.");
	      }
	      
	      sc.close();
	   }
	}
