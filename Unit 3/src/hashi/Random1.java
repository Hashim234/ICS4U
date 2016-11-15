/**

 * 
 */
package hashi;
import java.util.Scanner;

/**ICS3U
 * Random1.java
 *  ask for a person's name, and then 70% of the time says that the name they typed is their favorite, and 30% of the time says they hate that name.
 * Hashim Hashi
 * 09/11/2016
 */
public class Random1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	double  perc;	
	String	name;
	
	System.out.print("enter your name: ");
		name= sc.nextLine();
		
		perc= Math.random();
		
		if (perc>=0.7){
		
			System.out.print("this is not your favourite name.");
		}
		
		else {	
		System.out.print("this is your favourite name.");
			
		}
	}

}
