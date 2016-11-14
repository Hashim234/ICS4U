/**
 * 
 */
package hashi;
import java.util.Scanner;
/** 
 * ICS3U
 * Hashim Hashi
 * PrimeFactor.java
 * finding the prime numbers for a positive integer
 * 14/11/2016
 */


public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int number;

		System.out.println("Enter a number: ");
		number=sc.nextInt();	
		 
		int count = 2;
		
		
		while (count<=number) {
		if(number% count==0){
		System.out.println(count);
		number=number/count;
		}
		else
			count= count+1;




		}}}
