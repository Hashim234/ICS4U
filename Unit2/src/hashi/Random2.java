/**
 * 
 */
package hashi;

import java.util.Scanner;

/**ICS3U
 * Random2.java
 *  a program that simulates rolling two dice twice, first for the user, and then for the computer. Then announce who won: the user, the computer, or say it was a tie.
 * Hashim Hashi
 * 09/11/2016

 */
public class Random2 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int die1;
		int die2;
		int cdie1;
		int cdie2;
		int total;
		int ctotal;

		die1=(int)(Math.random()*6+1);
		die2=(int)(Math.random()*6+1);
		cdie1=(int)(Math.random()*6+1);
		cdie2=(int)(Math.random()*6+1);

		total= die1 + die2;
		ctotal= cdie1 +cdie2;


		if (total>ctotal){
			System.out.println("the user total was: " + total);
			System.out.println("the computer total was: " + ctotal);
			System.out.print("the user has won ");

		}
		else if(total==ctotal){
			System.out.println("the user total was: " + total);
			System.out.println("the computer total was: " + ctotal);
			System.out.print(" it was a draw");
		}

		else{
			System.out.println("the user total was: " + total);
			System.out.println("the computer total was:" + ctotal);
			System.out.print("the computer has won");
		}
	}

}


