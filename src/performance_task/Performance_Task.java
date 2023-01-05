package performance_task;

/*
 * See pdf for instructions
 */

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		boolean playAgain = true;
		
		int numWins = 0;
		int numLosses = 0;
		
		do {
			
			//random # from 1 to 1000 for user to guess
			final int SECRET_NUMBER = (int) (Math.random() * 1000) + 1;
			//System.out.println(SECRET_NUMBER);  //For Testing
			
			int guess = 0; //stores user's guess
			int guessesLeft = 9; //user gets 10 attempts to guess the number
			
			System.out.println("I'm thinking of a number from 1 to 1000.");
			System.out.println("Can you read my mind?!?\n");
			
			/*
			 * Main Game Loop
			 */
			do {
			
				//ask for their guess
				System.out.print("What's your guess? ");
				guess = inKey.nextInt();
				
				if (guess == SECRET_NUMBER) {  //if Correct
					System.out.println("That's it! You Win!\n");
					numWins++;
				}
				else if (guess < SECRET_NUMBER) { //if too low
					System.out.println("Too Low: " + guessesLeft + " guesses left.\n");
					guessesLeft--;
				}
				else { //if too high
					System.out.println("Too High: " + guessesLeft + " guesses left.\n");
					guessesLeft--;
				}
			
			} while (guess != SECRET_NUMBER && guessesLeft >= 0);  //loop until correct guess or out of guesses
			
			//check if they lost
			if (guessesLeft <= 0) {
				System.out.println("Sorry, you're outta guesses...  It was " + SECRET_NUMBER + ".\n");
				numLosses++;
			}
			
			//print overall results
			System.out.println("Wins = " + numWins);
			System.out.println("Losses = " + numLosses + "\n");
			
			
			
			/*
			 * Ask if they want to play again?
			 */
			inKey.nextLine(); //burn a line for the Scanner
			char input = 0;
			boolean validInput = false;
			
			do {
				System.out.print("Play again? (y or n): ");
				
				//grab 1st letter as a lower case char
				//space added to protect from outOfBounds exception
				input = (inKey.nextLine().toLowerCase() + " ").charAt(0);  
				
				if (!(input == 'y' || input == 'n' )) { //if input is not 'y' or 'n'
					System.out.println("Invalid Input\n");
				}
				else {
					validInput = true;
				}
				
				
			} while (!validInput); //(loop until proper input is given
			
		
			if (input =='n') {
				playAgain = false;
			}
			
		} while (playAgain);
		
		System.out.println("\nGoodbye!");
	}
	
}
