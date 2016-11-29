/**
 * 
 */
package hashi;
import java.util.*;
/**ICS3U
 *RemoveString.java
 * This program removes a word from a sentence.
 * Hashim Hashi
 * 28/11/2016
 */
public class RemoveString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

	 String sentence;
	 String word; 
	 
		System.out.print("Enter a sentence:");
		sentence=sc.nextLine();
		
		System.out.print("Enter a string:");
		word=sc.nextLine();
		
		System.out.print(sentence.replace(word,""));
		sc.close();
	}

}
