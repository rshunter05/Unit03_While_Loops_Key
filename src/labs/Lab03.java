package labs;

import java.util.Scanner;

public class Lab03 {

	public static int pin = 1234;
	
	public static void main(String[] args) {

		problem01();
		problem02();
		problem03();
		problem04();
	}


	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		int count = 3;
		int input = 0;
		boolean isLocked = true;
		while (count > 0 && isLocked) {
			
			System.out.print("Enter Pin: ");
			input = inKey.nextInt();
			
			if (input == pin) {
				isLocked = false;
			}
			else {
				System.out.println("Incorrect Pin");
			}
			
			count--;
		}

		if (isLocked) {
			System.out.println("Account Locked\nThe FBI has been called");
		}
		else {
			System.out.println("Access Granted");
		}
		
	}


	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		double sum = 0.0;
		double input = 1.0;
		int count = -1;
		while (input != 0) {
			System.out.print("Enter Any Number: ");
			input = inKey.nextDouble();
			sum += input;
			count++;
		}
		System.out.println("You entered " + count +
						   " numbers that add up to " + 
						   sum +".");
		
	}


	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		String input = "";
		
		boolean correctInput = false;
		
		while (!correctInput) {
			System.out.print("Is it 1st period? (Enter yes or no) ");
			input = inKey.nextLine();
			
			if (!input.substring(0,1).equalsIgnoreCase("y")
			    && !input.substring(0,1).equalsIgnoreCase("n")) {
				
				System.out.println("Invalid Response");
			}
			else {
				correctInput = true;
			}
			
		}
		
		System.out.println("Thank you!");
		
	}

	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter the % deterioration per cycle: ");
		double deterioration = inKey.nextDouble() / 100.0;
		System.out.print("Enter the lower threshold for this substance: ");
		double threshold = inKey.nextDouble();
		
		double current = 100.0;
		int cycleNum = 0;
		
		System.out.println(" Cycle #      % Remaining\n"
						 + "--------------------------");
		while (current >= threshold) {
			cycleNum++;
			current -= current * deterioration;
			System.out.printf(" %3d             %6.3f%n", cycleNum, current);
		}
		System.out.println("Replace after " + cycleNum + " cycles");
		
		
	}
	
	
}
