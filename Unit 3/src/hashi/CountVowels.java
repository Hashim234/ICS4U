/**
 * 
 */
package hashi;
import java.util.*;
/**ICS3U
 * CountVowels.java
 * This program counts how many vowels there are in a sentence.
 *Hashim Hashi
 *05/12/2016
 */
public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int vowels=0;
		String word;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
		
		System.out.print("Enter a text:");
		word=sc.nextLine();
		
		for(int i= 0;i<word.length();i++){
		if(word.charAt(i)=='a'){
			vowels++;
		}
		else if(word.charAt(i)=='e'){
			vowels++;
		}
		else if(word.charAt(i)=='i'){
			vowels++;
		}
		else if(word.charAt(i)=='o'){
			vowels++;
		}
		else if	(word.charAt(i)=='u'){
			vowels++;
		}
		}
		System.out.println("The number of vowels in " + word + " is "+vowels +".");
		  sc.close();
		  
		   
		  
	}

}
