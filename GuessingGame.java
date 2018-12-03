// File: GuessingGame.java
// Written by: Jennifer King
// Date: 11/03/2018

import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		int numGuesses = 1;
		
		System.out.println("I'm thinking of a number between 1 and 10.");
		System.out.print("Guess what it is: ");
		Scanner scanner = new Scanner(System.in);
		int guess = scanner.nextInt();
		
		for(; guess != num; numGuesses++)
		{
			if(guess < num)
			{
				System.out.println("No, that's too low.");
				System.out.print("Guess again: ");
				guess = scanner.nextInt();
			}
			else if(guess > num)
			{
				System.out.println("Sorry, that's too high.");
				System.out.print("Guess again: ");
				guess = scanner.nextInt();
			}
			else
			{
				;
			}
		}
		System.out.println("Congratulations! You guessed it!");
		System.out.println("I was thinking of the number " + num + ".");
		System.out.println("You got it right in " + numGuesses + ((1 == numGuesses) ? " guess.":" guesses."));
		scanner.close();
	}
}
