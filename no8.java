package practice2;

import java.util.Scanner;

public class practice2 {
	
	 public static boolean inRect(int x, int y) {
	       if((x >= 100 && x <= 200) && (y >= 100 && y <= 200))
	           return true;
	        else
	           return false;
	   }
	   
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      int x1, y1;
	      int x2, y2;
	      boolean a, b; //a는 (x1,y1)의 결과, b는 (x2,y2)의 결과
	      
	      System.out.print("(x1, y1) 의 값을 입력해 주세요 >>");
	      x1 = sc.nextInt();
	      y1 = sc.nextInt();
	      System.out.print("(x2, y2) 의 값을 입력해 주세요 >>");
	      x2 = sc.nextInt();
	      y2 = sc.nextInt();
	      
	      a = inRect(x1,y1);
	      b = inRect(x2,y2);
	      
	      if(a == true || b == true) {
	         System.out.print("두 사각형은 충돌합니다.");
	      }
	      else {
	         System.out.print("두 사각형은 충돌하지 않습니다.");
	      }
	      
	      sc.close();
	   }

	}
