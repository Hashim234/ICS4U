/**
 * 
 */
package hashi;
import java.util.*;
/**
 * @author 324350081
 *
 */
public class GroupAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String first;
		String last;

		System.out.print("Enter your first name: ");
		first=sc.nextLine();

		System.out.print("Enter your last name: ");
		last=sc.nextLine();

		if(last.startsWith("A")||last.startsWith("B")||last.startsWith("C")||last.startsWith("D")||last.startsWith("E")||last.startsWith("F")||last.startsWith("G")||last.startsWith("H")||last.startsWith("I") ){
			System.out.print(first+ last+"is assigned to group 1");

		}
		else if(last.startsWith("J")||last.startsWith("K")||last.startsWith("L")||last.startsWith("M")||last.startsWith("N")||last.startsWith("O")||last.startsWith("P")||last.startsWith("Q")||last.startsWith("R")||last.startsWith("S") ){
			System.out.print(first+ last+"is assigned to group 2");
		}
		else  {
			System.out.print(first+ last+" is assigned to group 3");
		}		

		






	}

}
