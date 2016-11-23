/**
 * 
 */
package hashi;
import java.util.Scanner;
/** ICS3U
 * Hashim Hashi
 *PowerTables.java
 *this program displays a table of powers 
 *16/11/2016
 */
public class PowersTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numbpower;


		System.out.print("Enter the number to be powered:");
		numbpower= sc.nextInt();


		System.out.format("%1s%6s%8s%8s%8s%1s","X^1","X^2","X^3","X^4","X^5","\n");
		for(int i=1;i<=numbpower;i++){	
			System.out.print((int)Math.pow(i,1)+"\t");
			System.out.print((int)Math.pow(i,2)+"\t");
			System.out.print((int)Math.pow(i,3)+"\t");
			System.out.print((int)Math.pow(i,4)+"\t");
			System.out.println((int)Math.pow(i,5)+"\t");
			


		}














	}

}
