package Hashim;

import java.util.Arrays;
import java.util.Scanner;

public class listminimum {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		/**
		 * 
		 * 3
		 * 
		 * 4 6 2
		 */

		// int num1, num2, num3;
		// int num[0], num[1], num[2],

		// Declare an array of Integer
		int[] numbers = new int[num];

		for (int i = 0; i < num; i++) {
			numbers[i] = scan.nextInt();
		}

		Arrays.sort(numbers);

		for (int i = 0; i < num; i++) {
			System.out.println(numbers[i]);
		}

		int h = 10;

		int n;

		if (h == 10) {
			System.out.println("It's ten");
			n = 10;
		} else {
			System.out.println("Not ten");
			n = 0;
		}

		// Ternary Operation
		System.out.println(h == 10 ? "It's ten" : "Not ten");
		n = h == 10 ? 10 : 0;
		
		

	}
}
