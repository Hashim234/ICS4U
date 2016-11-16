/**
 * 
 */
package hashi;
import java.util.Scanner;
/**ICS3U
 * Hashim Hashi
 * GuessingGame.java
 * guessing a number between 1 and 20
 * 11/11/2016
 */
public class GuessingGame {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int number;
		int correctguess =(int)(Math.random()*19)+2;
		
		System.out.println(" enter a number between 1 and 20");
	number = sc. nextInt();
	
	if (correctguess==number){
	System.out.println(" you won");
	}
	
	if (number> correctguess){
	System.out.println("Good try");
	}
	
	else
		System.out.println("Computers number: " + correctguess);
	System.out.println("Players number: " + number);
	
	
	
	}
	
	

}
