package problems;

import java.util.Scanner; 
public class Convert { 
  public static void main(String args[]) { 
    Scanner input = new Scanner(System.in);  
    double USD, INR;  
    System.out.println("Enter the amount of US dollars\n");  
    USD = input.nextDouble();  
    input.close(); 
    INR = 83.10405*USD;  
    System.out.printf("USD converted to Rupees:  %.2f\n", INR); 
  } 
} 