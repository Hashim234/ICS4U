/**
 * 
 */
package hashi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 324350081
 *
 */
public class Designing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		
		double designing;
		double coding;
		double debugging;
		double testing;
		double total;
		double designingPercentage;
		double codingPercentage;
		double debuggingPercentage;
		double testingPercentage;
		
		
		
		System.out.print("Designing:");
		designing =sc.nextInt();
		
		System.out.print("Coding:");
		coding =sc.nextInt();

		System.out.print("Debugging:");
		debugging =sc.nextInt();

		System.out.print("Testing:");
		testing =sc.nextInt();
		System.out.print("\n");
		total= (designing+ coding+ debugging+ testing);
		
		System.out.println("Task\t\t% Time");
		System.out.println("Designing\t"+df.format(designing/total));
		System.out.println("Coding\t\t"+df.format(coding/total));
		System.out.println("Debugging\t"+df.format(debugging/total));
		System.out.println("Testing\t\t"+df.format(testing/total));
	}

}
