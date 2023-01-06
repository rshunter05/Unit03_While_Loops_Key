package labs;

import java.util.Scanner;

public class Lab03 {

	public static int pin = 6428;  //store the pin for problem #1  
	
	public static void main(String[] args) {

		problem01();
		problem02();
		problem03();
		problem04();
	}


	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		int attemptsLeft = 3;  //track number of attempts left 
		int input = 0;  //store pin inputed from user
		
		boolean isLocked = true;  //account starts off locked
		
		//loop attemptsLeft number of times or until input == pin (whichever is first) 
		while (attemptsLeft > 0 && isLocked) {
			
			//get input from user
			System.out.print("Enter Pin: ");
			input = inKey.nextInt();
			
			//check if input is correct
			if (input == pin) {
				isLocked = false;  //unlock account
			}
			else {
				//state the pin is incorrect
				System.out.println("Incorrect Pin");
			}
			
			attemptsLeft--;  //lower number of attempts
		}

		if (isLocked) {
			//If pin was entered correctly
			System.out.println("Account Locked\nThe FBI has been called");
		}
		else {
			//I pin was not entered correctly
			System.out.println("Access Granted");
		}
		
	}


	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		
		double sum = 0.0;  //stores sum of all inputs
		double input = 1.0;  //stores user input
		
		int count = -1;  //tracks number of inputs (not including final 0)
		
		//stop loop when user enters 0
		while (input != 0) {
			
			//get user input
			System.out.print("Enter Any Number: ");
			input = inKey.nextDouble();
			
			sum += input;  //add input to sum
			count++;  //increment count
		}
		//state findings
		System.out.println("You entered " + count +
						   " numbers that add up to " + 
						   sum +".");
		
	}


	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		String input = "";  //holds user input
		
		boolean correctInput = false;  //assume input is false
		
		//loop until correct input given
		while (!correctInput) {
			
			//get input from user
			System.out.print("Is it 1st period? (Enter yes or no) ");
			input = inKey.nextLine() + " ";  //add space to protect from OutOfBounds Exception
			
			//check if the first character is NOT either a 'y' or an 'n' regardless of case
			if (!input.substring(0,1).equalsIgnoreCase("y")
			    && !input.substring(0,1).equalsIgnoreCase("n")) {
				
				//if not 'y' or 'n' tell user it's an invalide response
				System.out.println("Invalid Response");
			}
			else {
				//stop the loop
				correctInput = true;
			}
			
		}
		
		System.out.println("Thank you!");
		
	}

	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter the % deterioration per cycle: ");
		double deterioration = inKey.nextDouble() / 100.0;  //store percent deterioration in decimal form
		System.out.print("Enter the lower threshold for this substance: ");
		double threshold = inKey.nextDouble();  //store lower threshold of substance
		
		double current = 100.0; //stores current amount remaining of substance
		int cycleNum = 0;  //counts how many times the substance has been used
		
		//print chart headder
		System.out.println(" Cycle #      % Remaining\n"
						 + "--------------------------");
		//loop while the amount remaining is within given tolerance 
		while (current >= threshold) {
			cycleNum++;  //count the cycle
			current -= current * deterioration;  //lower the amount left according to the given deterioration
			
			//print this chart line's cycle number and % remaining (3 decimals)
			System.out.printf(" %3d             %6.3f%n", cycleNum, current);  
		}
		
		//print footer
		System.out.println("Replace after " + cycleNum + " cycles");
		
		
	}
	
	
}
