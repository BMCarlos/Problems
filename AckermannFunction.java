package work;

import java.util.Scanner;

public class AckermannFunction {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value for m: ");
		
		int m = input.nextInt();
		
		System.out.print("Enter value for m: ");
		int n = input.nextInt();
		
		int result = ackermann(m,n);
		System.out.println("ackermann(" + m + ", " + n + ") = " + result );
		//System.out.println(ackermann(0, 0));
	}
		static int ackermann(int m, int n) { 
			
		if (m==0)
			return n + 1;
		else if (n==0)
			return ackermann(m-1, 1);
		else 
			return ackermann(m-1, ackermann(m, n - 1));
		}
//		if (m == 0) {
//			System.out.println("Ackermann (" + m + ")= 0");
//		return n + 1;
//		}
//		else if (n == 0){
//			System.out.println("Ackermann (" + n + ")= 0");
//			return ackermann(m - 1, 1);
//		}else{
//			System.out.println("Ackermann (" + m + ", " + n + ") = ackermann(" + m + ", ackermann(" + (m - 1) + ", " + n + " - 1))");
//			return ackermann(m - 1, ackermann(m,n - 1));
//		}
		
	}


