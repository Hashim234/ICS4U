package Hashim;

/**
 * This program expects two command-line arguments
 * -- a person's first name and last name.
 */
public class Greetings
{
	public static void main(String[] args)
	{
		String firstName = args[0];
		String lastName = args[1];
		System.out.println("Hello " + firstName + " " + lastName); System.out.println("Congratulations on your second program!");
	}
}