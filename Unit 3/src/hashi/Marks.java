/**
 * 
 */
package hashi;

import java.util.Scanner;

/**
 * Hashim Hashi
 * Marks.java
 *  giving a grade for your testscore
 *2016/02/11
 *
 */
public class Marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int mark;
		char grade;
		
		System.out.print("enter the percentage:");
		mark= sc.nextInt();
		
		if(mark>=90){
	      System.out.print("your corresponding letter grade is: "+  (grade='A')); 
			}
			else if(mark>=80){
				 System.out.print("your corresponding letter grade is: "+ (grade='B'));	
			}
				else if(mark>=70){
					 System.out.print("your corresponding letter grade is: "+ (grade='C'));	 
				}
			else if(mark>=60){
				 System.out.print("your corresponding letter grade is: "+ (grade='D'));	
			}
			
			
			else
				 System.out.print("your corresponding letter grade is: "+ (grade='F'));	 			
		
		
		
	}

}
