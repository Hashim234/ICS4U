/**
 * 
 */
package hashi;
import java.util.Scanner;
/**ICS3U
 * hashim Hashi
 *GuessingGame2.java
 *infinite chances to guess the secret  number
 *16/11/2016
 */
public class GuessingGame2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int guess;
		int number;
		int correctguess =(int)(Math.random()*19)+2;
		int count  = 0;



		while(count<=1){
			System.out.print("enter a number between 1 and 20: ");
			number= sc.nextInt();

			if (correctguess==number){
				System.out.println(" you won");
				count=2;
			}
			else
				System.out.println("Keep going");



		}



	}
}