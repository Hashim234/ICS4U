/**
 * 
 */
package hashi;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * ICS3U
 * hashim hashi
 *Quadratic Formula
 *30/09/2016
 */
public class QuadtricFormula {

	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
DecimalFormat df= new DecimalFormat ("0.00");		
		int a,b,c;
		System.out.println("Enter the numbers for your variables");
		
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
		
		System.out.println("The + answer is" +(df.format(-1*b+Math.sqrt ((b^2)-(4*(a)*(c)))/2*a)));
		System.out.println("The - answer is" +(df.format(-1*b-Math.sqrt ((b^2)-(4*(a)*(c)))/2*a)));
		
		
		
		
		
		
		
		
		
	}

}
