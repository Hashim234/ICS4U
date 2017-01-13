/**
 * 
 */
package hashi;
import java.util.Scanner;
/**ICS3U
 * FunWithMath.java
 * this program will ask the user for two numbers and they will choose if they want to +,-,/ or * 
 *Hashim Hashi
 *13/01/2017
 */
public class FunWithMath {
	/**
	 *Multiplies the two variables 
	 */
	public static void multiply(int num1, int num2){
		int total;
		total=num1*num2;
		System.out.println("Your total is " + total);
	}
	/**
	 *Divides the two variables
	 */
	public static void divide(int num1,int num2){
		int total;
		total=num1/num2;
		System.out.println("Your total is " + total);
	}
	/**
	 *subtracts the two variables 
	 */
	public static void subtract(int num1, int num2){
		int total;
		total=num1-num2;
		System.out.println("Your total is " + total);
	}
	/**
	 *Adds the two variables 
	 */
	public static void add(int num1, int num2){
		int total;
		total=num1+num2;
		System.out.println("Your total is " + total);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1;	int num2; int methodnums;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter two numbers.");
		num1=sc.nextInt();  
		num2=sc.nextInt();
		System.out.println("if you would like to add press 1, to subtract press 2, to multiply press 3 and to divide press 4.");
		methodnums=sc.nextInt();

		if(methodnums==1){
			add(num1,num2);   
		}
		else if(methodnums==2){
			subtract(num1,num2); 
		}
		else if(methodnums==3){
			multiply(num1,num2);
		}
		else{
			divide(num1,num2);
		}
	}

}
