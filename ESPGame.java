/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: This is an extrasensory perception game where the software randomly picks colors and the user should guess the correct color.
 * Due: 02/06/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ferenc Leonardo Livak
*/

import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{
	public static final String BLUE_COLOR = ("blue");
	public static final String GREEN_COLOR = ("green");
	public static final String YELLOW_COLOR = ("yellow");
	public static final String RED_COLOR = ("red");
	public static final String PINK_COLOR = ("pink");
	public static final String BLACK_COLOR = ("black");
	public static final String WHITE_COLOR = ("white");

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Enter your name: ");
		String name = new String(input.nextLine());
		System.out.print("Describe yourself: ");
		String description = new String(input.nextLine());
		System.out.print("Due Date: ");
		String dueDate = new String(input.nextLine());
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		int randomNumber, score = 0;
		String colorGuess = new String("blue");
		String colorsList = new String("-blue-green-yellow-red-pink-black-white-");
		String randomColor = new String();
		
		for (int round = 1; round < 12; round++)
		{
			System.out.println("Round " + round + "\n\nI am thinking of a color.\nIs it Blue, Green, Yellow, Red, Pink, Black, or White?");
			System.out.println("Enter your guess: ");
			do
			{
				if (colorGuess.length() > 6 || colorsList.contains('-' + colorGuess + '-') == false)
				{
					System.out.println("You entered an incorrect color. Is it Blue, Green, Yellow, Red, Pink, Black, or White?\nEnter your guess again:");
				}
				colorGuess = input.nextLine().toLowerCase();
		
			}
			while (colorGuess.length() > 6 || colorsList.contains('-' + colorGuess + '-') == false);
			
			randomNumber = rand.nextInt(7);
			
			switch (randomNumber)
			{
				case 0 -> randomColor = BLUE_COLOR;
				case 1 -> randomColor = GREEN_COLOR;
				case 2 -> randomColor = YELLOW_COLOR;
				case 3 -> randomColor = RED_COLOR;
				case 4 -> randomColor = PINK_COLOR;
				case 5 -> randomColor = BLACK_COLOR;
				case 6 -> randomColor = WHITE_COLOR;
			}
			
			System.out.println("\nI was thinking of " + randomColor + '.');
			
			if (colorGuess.equals(randomColor))
			{
				score++;
			}
		}
		
		System.out.println("\nGame Over\n");
		System.out.println("You guessed " + score + " out of 11 colors correctly.");
		System.out.println("Student Name: " + name);
		System.out.println("User Description: " + description);
		System.out.println("Due Date: " + dueDate);
		
		input.close();
	}

}
