package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem01();
		problem02();
		problem03();

	}


	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		
		
		int count = input;  //to count the interations
		int sum = 0; 		//store the sum
		
		while (count > 0) { //count down to 0 adding each count to sum
			count--;
			sum += count;
		}
		System.out.println("The sum of all integers less than " + input + " is " + sum + ".");
	}


	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		
		//get 2 user inputs
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		//determine which one is bigger
		int max = Math.max(input1, input2) - 1;
		int min = Math.min(input1, input2);
		int sum = 0;  //to store the sum
		
		while (max > min) {  //loop from max to min (exclusive)
			if (max % 2 == 0) {  
				sum += max;  //add only even values of max to the sum
			}
			max--;  //de-increment sum
		}
		System.out.println("The sum of all even integers between " + 
					input1 + " and " + input2 + " is " + sum + ".");
		
	}


	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		
		//get user input
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		
		int count = input1;  //track iterations
		int sum = 0;		//to sum up all inputs
		
		while (count > 0) { //loop according to input1
			
			System.out.print("Enter any integer: ");
			sum += inKey.nextInt();  //add each input to sum
			count--;
		}
		System.out.println("The sum of those " + input1 + 
						   " numbers is " + sum + ".");
		
	}


}
