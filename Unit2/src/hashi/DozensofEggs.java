/**
 * 
 */
package hashi;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 * Hashim Hashi
 * DozenofEggs.java
 * ask user for number of eggs and changes prices when amounts are added
 *2016/03/11
 */
public class DozensofEggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");


		double NumEggs; 


		System.out.print("enter the number  of eggs purchased: ");NumEggs= sc.nextDouble();
		NumEggs =NumEggs/12;



		if(NumEggs>=11){

			System.out.println("The bill is equal to: $"+ (df.format(0.35*NumEggs)));
		}

		else if (NumEggs>=6){
			
			System.out.println("The bill is equal to: $" + (df.format(0.40*NumEggs)));
		}

		else if (NumEggs>=4){
			System.out.println("The bill is equal to: $" + (df.format(0.45*NumEggs)));
			
		}			
	   else {
		   
			System.out.println("The bill is equal to: $" + (df.format(0.50*NumEggs)));
				
		}

		}
















	}


