/**
 * 
 */
package hashi;

 import java.util.Scanner;
/**
 * ICS3U
 * hashim hashi
 * Arithmetic Expressions
 *28/09/16
 */
public class ArithmeticExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3,num4,num5;
		System.out.println("Enter 5 numbers");
		num1 =sc.nextInt();
		num2 =sc.nextInt();
		num3 =sc.nextInt();
		num4 =sc.nextInt();
		num5 =sc.nextInt();
		
		
		System.out.println("The sum of these numbers are " + (num1 + num2 + num3 + num4 + num5));
		System.out.println("The result after subtracting the second number from the third is " + ( num2 - num3));
		System.out.println("The product of the first and fifth number is " + ( num1 * num5));
		System.out.println("The quotient of the fourth number divided by the second number is " + ( num4 / num2));
		System.out.println("The remainder when dividing the fourth number by the second number is " + ( num4 % num2));
		
		
	}

}
