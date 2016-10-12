/**
 * 
 */
package hashi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * ICS3U
 * Hashim Hashi
 * Order Application
 *12/10/2016
 */
public class OrderApplication {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		DecimalFormat df= new DecimalFormat ("0.00");
		 double burgerPrice= 1.69;
		 double friesprice= 1.09;
		 double sodaprice= .99;
		 
		 double amountTendered;
		 double numberofBurgers;
		 double numberofFries;
		 double numberofSodas;
		 
		 System.out.println("Enter the number of burgers");
		 numberofBurgers =sc.nextInt();
		 System.out.println("Enter the number of fries");
		 numberofSodas =sc.nextInt();
		 System.out.println("Enter the number of sodas");
		 numberofSodas =sc.nextInt();
	
		 System.out.println("your total before tax is " + (df.format(burgerPrice*numberofBurgers + friesprice*numberofSodas + sodaprice*numberofSodas)));
		 double total =(burgerPrice*numberofBurgers + friesprice*numberofSodas + sodaprice*numberofSodas);
		 System.out.println("tax:" + df.format((burgerPrice*numberofBurgers + friesprice*numberofSodas + sodaprice*numberofSodas)*0.065));
		 double tax =((burgerPrice*numberofBurgers + friesprice*numberofSodas + sodaprice*numberofSodas)*0.065);
		 System.out.println("Final total: $" +df.format(total+tax) );
		 double finalTotal=(total+tax);
		 
		 System.out.println("Enter amount tendered:");
		 amountTendered = sc.nextInt();
		 
		 System.out.println("Change: $" + df.format(amountTendered-finalTotal));
		 
		 
		 
	}

}
