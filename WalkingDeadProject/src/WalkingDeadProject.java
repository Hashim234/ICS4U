
/**
 * 
 */
import java.util.Scanner;
import hsa_new.Console;
//import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//When ever someone dies it will automatically reset your game



import javax.imageio.ImageIO;
/**ICS3U
 * WalkingDeadProject.java
 * this program is a game based on the show the Walking Dead
 *Hashim and Navtej
 *23/12/2016
 */
public class WalkingDeadProject {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Console c = new Console();
		Scanner scan = new Scanner(System.in);
		boolean gameOver = false;

		String answer;
		boolean guessed = false;
		do{
			try {	
				BufferedImage walkingdeadjpg2 = ImageIO.read(new File("walking-dead-rosita copy.jpg"));
				c.drawImage (walkingdeadjpg2, 0,0, null);
			c.println("You're in a zombie apocalypse who shall you be? Rick or Roseta?");
			answer = c.readLine();
			c.clear();

			if (answer.equalsIgnoreCase("Rick")) {
				BufferedImage hospital = ImageIO.read(new File("Abandoned Berlin Zombie Hospital-7552.jpg"));
				c.drawImage (hospital, 0,50, null);
				c.println("You're in a hospital");
				c.clear();
				
				BufferedImage outsideorsearch = ImageIO.read(new File("Abandoned Berlin Zombie Hospital-7552 copy.jpg"));
				c.drawImage (outsideorsearch, 0,50, null);
				c.println("Do you want to go outside or search the hospital?");
				answer = c.readLine();
                c.clear();
				
				if (answer.equalsIgnoreCase("Outside")) {
					BufferedImage oalley = ImageIO.read(new File("maxresdefault copy.jpg"));
					c.drawImage (oalley, 0,50, null);
					c.println("Do you want to walk towards the main road or go down the dark alley?");
					answer = c.readLine();
					c.clear();
					
					
					if (answer.equalsIgnoreCase("Main road")) {
						BufferedImage car = ImageIO.read(new File("maxresdefault (1).jpg"));
						c.drawImage (car, 0,50, null);
						c.println("You found a car use your knife to unlock it");
						c.println("which way do you turn your knife in the lock? left or right?");
						answer = c.readLine();
						c.clear();

						if (answer.equalsIgnoreCase("Left")) {
							BufferedImage car2 = ImageIO.read(new File("maxresdefault (1).jpg"));
							c.drawImage (car2, 0,50, null);
							c.println("You have unlocked the car and driven to your group");
							c.println("You reunited with your group");
							c.println("Do you want to play again");
							if(c.readLine().equalsIgnoreCase("No")){
								gameOver = true;
							}
						} else {
							BufferedImage zombiesv5 = ImageIO.read(new File("article-1209052-062E5399000005DC-400_468x286.jpg"));
							c.drawImage (zombiesv5, 0,50, null);
							c.println("Your knife got jammed in the door, zombies ambushed you");
							c.println("Do you want to play again");
							c.readLine();
							if(c.readLine().equalsIgnoreCase("No")){
								gameOver = true;
							}
						}
					} else {
						BufferedImage group = ImageIO.read(new File("11709637-large.jpg"));
						c.drawImage (group, 0,50, null);
						c.println("You have reunited with you group");
						c.println("Do you want to play again");
						c.readLine();
						if(c.readLine().equalsIgnoreCase("No")){
							gameOver = true;
						}
					}
				} else {
					BufferedImage sroom = ImageIO.read(new File("Warehouse_048 copy.jpg"));
					c.drawImage (sroom, 0,50, null);
					c.println("do you want go down the staircase or search the room?");
					answer = c.readLine();
					c.clear();

					if (answer.equalsIgnoreCase("Staircase")) {
						c.println("you get eaten alive by zombies");
						c.println("Do you want to play again");
						c.readLine();
						if(c.readLine().equalsIgnoreCase("No")){
							gameOver = true;
						}
					} 
					else {
						BufferedImage safe = ImageIO.read(new File("safe.jpg"));
						c.drawImage (safe, 0,50, null);
						c.println("you found a safe you have three chances to unlock");
						int[] guess = { 0, 1, 2, 3, 4 };
						int[] secretNumber = { 0, 1, 2, 3, 4 };

						c.println("Guess the secret code, consisting of 1, 2 or 3");

						for (int i = 0; i < 3; i++) {

							c.println("Guess number: " + (i + 1));
							guess[i] = Integer.parseInt(c.readLine());

							c.println(
									"Your guesses: " + "[" + guess[0] + "]" + "[" + guess[1] + "]" + "[" + guess[2] + "]");

							for (int e = 0; e < 1; e++) {
								secretNumber[e] = (int) (Math.random() * 2 + 1);

								c.println("Secret code: " + "[" + secretNumber[0] + "]" + "[" + secretNumber[1] + "]" + "["
										+ secretNumber[2] + "]" + "[" + secretNumber[3] + "]");

								if (guess[i] == secretNumber[e]) {
									c.println("You have found a hatchet");
									c.clear();
									c.println("You have killed a dozen zombies and now have reuntied with your group");
									c.println("Do you want to play again");
									c.readLine();
									if(c.readLine().equalsIgnoreCase("No")){
										gameOver = true;
									}
									guessed = true;
									break;

								} else if (i==2 && guess[i] != secretNumber[e]) {
									c.println("You took too long zombies ate your brains");
									c.println("Do you want to play again");
									c.readLine();
									if(c.readLine().equalsIgnoreCase("No")){
										gameOver = true;
									}
								}
							}

							if (guessed) {
								break;
							}
						}
					}while(!gameOver);
					}

				}
			
			
		
				
			     if  (answer.equalsIgnoreCase("Roseta")){
				c.clear();

				BufferedImage barnorout = ImageIO.read(new File("zombie_barn_by_ouroboros_mechanicus-d4vl2vs copy.jpg"));
				c.drawImage (barnorout, 0,0, null);
				c.println("You're in a barn, Do you want to search the barn or go outside? (Search Or Outside)");
				answer = c.readLine();
				c.clear();
				if (answer.equalsIgnoreCase ("Search")){
				c.println("You found a weapon while searching the barn, Do you take it or leave it?.");
				answer = c.readLine();
				

				
				if (answer.equalsIgnoreCase("take it")){
				
				c.println("You are ambushed by zombies,you manage to kill some but die.");

				}else if (answer.equalsIgnoreCase("leave it")){
				c.println("You end up getting ambushed from a huge wave of zombies.");

				}

				}else if (answer.equalsIgnoreCase("Outside")){
				c.clear();
				BufferedImage field = ImageIO.read(new File("walking-dead-rosita.jpg"));
				c.drawImage (field, 0,50, null);
				c.println("Do you want to search the field or go inside?(Search Or Inside)");
				answer = c.readLine();
						
				if (answer.equalsIgnoreCase("Search")){
				BufferedImage zombies2 = ImageIO.read(new File("zombies4.jpg"));
				c.drawImage (zombies2, 0,50, null);
				c.println("When you are searching the field zombies come and ambush you");
				
				
				}else if (answer.equalsIgnoreCase("Inside")){
				c.println("You go inside the house and end up dying");
				}
				}
				}
				}catch( IOException e){ 
				System.err.println(e.getMessage());
				}

			
		
			
		
		}	while(!gameOver);
	}
}
