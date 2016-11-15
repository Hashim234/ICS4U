/**
 * 
 */
package hashi;

import java.util.Scanner;

/**
 * Positive&Negative&Divisible.java
 * to see if a number is + or - and divisible by 7
 * Hashim Hashi
 *01/11/2016
 */
public class PositiveAndNegativeAndDivisbleBy7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter a number");
		number= sc.nextInt();
		
		if(number>0)
			System.out.println("your number is positive");

		else
			System.out.println(" your number is negative");
		
		if(number%7==0){
			System.out.println( "your number is divisible by 7");
		}
		
		else
			System.out.println("Your number isn't divisible by 7");
		
		
	}

}
