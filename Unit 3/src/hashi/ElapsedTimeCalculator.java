/**
 * 
 */
package hashi;

import java.util.Scanner;

/**
 * ICS3U ElapsedTimeCalculator.java this program checks how much time has passed
 * by. Hashim Hashi 24/11/2016
 */
public class ElapsedTimeCalculator {

	/**
	 * @param args
	 */
	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int time;
	        int elapsedTime;
	        int totalTime;
	        String dayNight;

	        System.out.println("Enter the starting hour");
	        time = scan.nextInt();

	        System.out.println("Enter AM or PM");
	        dayNight = scan.next();

	        System.out.println("Enter the number of hours elapsed:");
	        elapsedTime = scan.nextInt();
	        totalTime = time + elapsedTime;

	        if (dayNight.toLowerCase().equals("am")) {
	            if (totalTime > 12) {
	                System.out.println("The time is " + (totalTime - 12) + "pm");
	            } else {
	                System.out.println("The time is " + totalTime + "am");
	            }
	        } else {
	            if (totalTime > 12) {
	                System.out.println("The time is " + (totalTime - 12) + "am");
	            } else
	                System.out.println("The time is" + totalTime + "pm");
	        }
	    }

}
