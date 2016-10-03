/**
 * 
 */
package hashi;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * @author 324350081
 *
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
