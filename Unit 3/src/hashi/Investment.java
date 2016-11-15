/**
 * 
 */
package hashi;
import java.util.Scanner;
/** ICS3U
 * Hashim Hashi
 * Investment.java
 * an investment program that calculate how many years it will take a $2,500 investment to be worth $5,000 if compounded annually at 7.5%
 * 15/11/2016
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int years = 1;
		int invest =2500;    
        double total  = 5000;  
        double cinvest = invest;
       
		
			while(cinvest<=total){
			 years = years + 1;
			
			cinvest = cinvest*1.075;
			}
			
	System.out.println("it will take you "+ years + " years to reach $5000");
	
	
	}
		
		
	}
		
	


