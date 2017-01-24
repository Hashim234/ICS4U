/**
 * 
 */
package hashi;

import java.util.Scanner;

import javax.imageio.ImageIO;

import hsa_new.Console;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**ICS3U
 *IQtest.java 
 * this program will give the user a test to
 *Hashim Hashi
 *20/01/2017
 */
public class IQtest {
	static Console c= new Console();
	static Scanner sc= new Scanner(System.in);

	/**
	 * @param args
	 * @throws InterruptedException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		int scoretracker =0;
		String answer;
		BufferedImage pic=ImageIO.read(new File("src/hashi/brain.jpg"));
		c.println("Welcome to Hashim's IQ test ");
		c.drawImage(pic, 100, 100, null);
		c.println("The rules will be stated on the next page");
		c.println("would you like to do the test");
		answer = c.readLine();
		c.clear();
		if(answer.equalsIgnoreCase("Yes")){
			rules();
			Thread.sleep(10000);
			c.clear();
			c.println("The test will begin");
			Thread.sleep(5000);
			c.clear();
           questionanswer(scoretracker);
           
         
		}
		else{
			c.close();

	
		}
		
	}
	/**
	 * this method will state the rules of the test	
	 */
	public static void rules(){
		c.println("1.You shall not search for answers on google.");
		c.println("2.You are only allowed to have a  pen and paper with you");	
		c.println("3.Each correct answer will be worth 10 points ");	
		c.println("4.Keep your eyes on your own screen");	
		c.println("5.you have 10 mins to complete the test");	
	}
	public static void questionanswer(int scoretracker){
		String[][] questanswers =new String [9][9];
		questanswers[0][0]="which animal has the most legs?"; 
		questanswers[1][0]="dog";
		questanswers[2][0]="tanrantula";
		questanswers[3][0]="shark";
		questanswers[4][0]="giraffe";
		questanswers[0][1]="How long can the average person hold their breath";
		questanswers[1][1]="30s";
		questanswers[2][1]="45s";
		questanswers[3][1]="1m";
		questanswers[4][1]="15s";
		questanswers[0][2]="Which one of the five choices make the best comparison?Finger is to hand as leaf is to";
		questanswers[1][2]="twig";
		questanswers[2][2]="tree";
		questanswers[3][2]="branch";
		questanswers[4][2]="blossom";
		questanswers[0][3]="If PEACH is to HCAEP AS 46251 is to:";
		questanswers[1][3]="26451";
		questanswers[2][3]="12654";
		questanswers[3][3]="25641";
		questanswers[4][3]="15264";
		questanswers[0][4]="Mary is 16 years old, four times older than her brother.How old will she be when she is twice his age ";
		questanswers[1][4]="20";
		questanswers[2][4]="24";
		questanswers[3][4]="25";
		questanswers[4][4]="26";
		questanswers[0][5]="If you rearrange the letters CIFAIPC you would have the name of a";
		questanswers[1][5]="CITY";
		questanswers[2][5]="Animal";
		questanswers[3][5]="Ocean";
		questanswers[4][5]="River";
		questanswers[0][6]="Choose the number that is 1/4 of 1/2 of of 1/5 of 200";
		questanswers[1][6]="2";
		questanswers[2][6]="10";
		questanswers[3][6]="5";
		questanswers[4][6]="50";
		
		c.println(questanswers[0][0]);
		c.println(questanswers[1][0]);
		c.println(questanswers[2][0]);
		c.println(questanswers[3][0]);
		c.println(questanswers[4][0]);
		c.println();
		String answer=c.readLine();
		
		if(questanswers[2][0].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][1]);
		c.println(questanswers[1][1]);
		c.println(questanswers[2][1]);
		c.println(questanswers[3][1]);
		c.println(questanswers[4][1]);
		c.println();
		 answer=c.readLine();
		
		if(questanswers[1][1].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][2]);
		c.println(questanswers[1][2]);
		c.println(questanswers[2][2]);
		c.println(questanswers[3][2]);
		c.println(questanswers[4][2]);
		c.println();
		 answer=c.readLine();
		
		if(questanswers[2][2].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][3]);
		c.println(questanswers[1][3]);
		c.println(questanswers[2][3]);
		c.println(questanswers[3][3]);
		c.println(questanswers[4][3]);
		c.println();
		 answer=c.readLine();
		
		if(questanswers[4][3].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][4]);
		c.println(questanswers[1][4]);
		c.println(questanswers[2][4]);
		c.println(questanswers[3][4]);
		c.println(questanswers[4][4]);
		c.println();
	    answer=c.readLine();
		
		if(questanswers[2][4].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][5]);
		c.println(questanswers[1][5]);
		c.println(questanswers[2][5]);
		c.println(questanswers[3][5]);
		c.println(questanswers[4][5]);
		c.println();
	    answer=c.readLine();
		
		if(questanswers[3][5].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		c.clear();
		c.println(questanswers[0][6]);
		c.println(questanswers[1][6]);
		c.println(questanswers[2][6]);
		c.println(questanswers[3][6]);
		c.println(questanswers[4][6]);
		 answer=c.readLine();
		
		if(questanswers[3][6].equalsIgnoreCase(answer)){
			scoretracker=scoretracker+10;
		}
		else{
			
		}
		  c.println("Your final score is " + scoretracker + "/70");
 	}
}
