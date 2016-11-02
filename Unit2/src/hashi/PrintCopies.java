/**
 * 
 */
package hashi;

import java.util.Scanner;
import java.text.DecimalFormat;


/**ICS3U
 * Hashim Hashi
 * PrintCopies.java
 * printing prices by the number of copies
 *2016/02/11
 */
public class PrintCopies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		
		int number;
		
		System.out.print("Enter number of copies to be printed:");
		number= sc.nextInt();
		
		if(number<=99){
		System.out.println("Price per copy is 0.30");	
		System.out.println("your total is $" + df.format(0.30*number));
		}
		else if(number<=499){
			System.out.println("Price per copy is 0.28");
			System.out.println("your total is $" + df.format(0.28*number));
		}
			else if(number<=749){
				System.out.println("Price per copy is 0.27");
				System.out.println("your total is $" + df.format(0.27*number));
			}
		else if(number<=1000){
			System.out.println("Price per copy is 0.26");
					System.out.println("your total is $" + df.format(0.26*number));
		}
		
		
					else if(number>1000){
						System.out.println("Price per copy is 0.25");
						System.out.println("your total is $" + df.format(0.25*number));
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		

	}

}
