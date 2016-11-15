/**
 * 
 */
package hashi;
import java.text.DecimalFormat;
/**ICS3U
 * Hashim Hashi
 *RandomGenerator.java
 *A program that implements the linear congruential  method.
 *11/11/16
 */
public class RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat ("0.00");
		
		final int a = 13456;
		final int c = 546;
		final int m = 50;
		final int seed = 13;
		
		
		
		int X0;
		int X1;
		int X2;
		int X3;
		int X4;
		int X5;
		int X6;
		int X7;
		int X8;
		int X9;
		
		X0=(a*seed+c)%m;
		X1=(a*X0+c)%m;
		X2=(a*X1+c)%m;
		X3=(a*X2+c)%m;
		X4=(a*X3+c)%m;
		X5=(a*X4+c)%m;
		X6=(a*X5+c)%m;
		X7=(a*X6+c)%m;
		X8=(a*X7+c)%m;
		X9=(a*X8+c)%m;
		
		
		System.out.println(X0);
		System.out.println(X1);
		System.out.println(X2);
		System.out.println(X3);
		System.out.println(X4);
		System.out.println(X5);
		System.out.println(X6);
		System.out.println(X7);
		System.out.println(X8);
		System.out.println(X9);
		
		
	}

}
