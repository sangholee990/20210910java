package practice2;

import java.util.Scanner;

public class practice2 {
	
	 public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	      
	      int x1, y1;
	      int x2, y2;
	      double r1, r2, distance;
	      
	      System.out.print("첫번째 원의 중심과 반지름 입력>>");
	      x1 = sc.nextInt();
	      y1 = sc.nextInt();
	      r1 = sc.nextDouble();
	      System.out.print("두번째 원의 중심과 반지름 입력>>");
	      x2 = sc.nextInt();
	      y2 = sc.nextInt();
	      r2 = sc.nextDouble();
	      
	      distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
	      
	      if(distance <= r1+r2) {
	         System.out.print("두 원은 서로 겹친다.");
	      }
	      else {
	         System.out.print("두 원은 서로 겹치지 않는다.");
	      }
	      
	      sc.close();
	   }

	}
