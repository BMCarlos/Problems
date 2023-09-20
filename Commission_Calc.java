package problems;

import java.util.Scanner; 
public class Commission_Calc { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in); 
    Double sale, C; 
    System.out.println("Enter sales total!"); 
    sale = input.nextDouble(); 
    C = sale*.20; 
    System.out.printf("Commission: $ %.2f",C); 
  } 
} 