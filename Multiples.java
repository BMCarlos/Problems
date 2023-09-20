package problems;

import java.util.Scanner;   
public class Multiples {  
    public static void main(String args[]) {  
      Scanner input = new Scanner(System.in);   
     int number1;   
     int number2;   
     System.out.print("Enter first interger:");   
     number1 = input.nextInt();   
     System.out.print("Enter second integer:");   
     number2 = input.nextInt();   
     if (number2 != 0 && number1 % number2 == 0) {   
    System.out.printf( "%d is a multiple of %d\n", number2, number1 ); 
     }else if (number1 != 0 && number2 % number1 == 0){ 
    System.out.printf( "%d is not a multiple of %d\n", number2, number1 );  
     } else {
    	 System.out.println("Neither number is a multiple of the other");
     }
  }  
} 