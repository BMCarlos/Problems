package problems;

import java.util.Scanner;   
public class EqualLessGreat {  
    public static void main(String args[]) {  
      Scanner input = new Scanner(System.in);   
     int number1;   
     int number2;   
     System.out.print("Enter first interger:");   
     number1 = input.nextInt();   
     System.out.print("Enter second integer:");   
     number2 = input.nextInt();   
      if (number1 == number2)  
      System.out.printf("%d is equal %d\n", number1, number2); 
       if (number1 < number2)  
      System.out.printf("%d is less then %d\n", number1, number2);  
       if (number1 > number2)  
      System.out.printf("%d is more then %d\n", number1, number2);  
  }  
} 