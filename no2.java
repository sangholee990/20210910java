package javatest1;


public class main {
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		int b = a%10;
		int c = a/10;
		
		if (b==c) {
			System.out.println("Yes! 10의자 자리와 1의 자리가 같습니다.");
		}
		
		else {
			System.out.println("no! 10의자 자리와 1의 자리가 같지 않습니다.");
		}
		
		
		
		
	}

}
