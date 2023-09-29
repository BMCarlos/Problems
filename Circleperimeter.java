package problems;

import java.util.Scanner;

public class Circleperimeter {
	public static void main(String[] args) {
		double rad, circ;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius!");
		
		rad = input.nextDouble();
		
		circ = circlePerm(rad);
		
	}
	static double circlePerm(double rad) {
		double circ = 2*Math.PI *rad;
		System.out.printf("%.3f", circ);
		return circ;
		
	}
}

//Write a complete Java application to prompt the user 
//for the double radius of a circle, and 
//call method circlePerm to calculate and display
//the circumference of the circle.

//Use the following statement to calculate
//the perimeter: double circum = 2*Math.PI * radius  