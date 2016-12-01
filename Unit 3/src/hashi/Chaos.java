/**
 * 
 */
package hashi;
import java.util.*;
/**ICS3U
 * Chaos.java
 * this program
 * hashim hashi
 *24/11/16
 */
public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		 
		  double total;
		   
		  System.out.print("Enter a number");
		  total =sc.nextDouble(); 
		  
		  for(int i=0;i<50;i++){
		  total= 2* total *(1 - total);
		  System.out.println(total);
			  
		  }
		  
		  
		  
		  
		  
	}

}
