package problems;

import java.util.Scanner;  
public class OddrEven { 
    public static void main(String args[]) { 
Scanner input = new Scanner(System.in); 
int num; 
System.out.print("Enter an integer: ");	 
num = input.nextInt();	 
if (num % 2 == 0) 
 System.out.printf("%d is an even number", num); 
if (num % 2 != 0) 
 System.out.printf("%d is an odd number", num);	 
  }	 
} 