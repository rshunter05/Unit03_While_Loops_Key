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
		
		System.out.print("Enter a positive integer: ");
		int input = inKey.nextInt();
		int count = input;
		int sum = 0;
		while (count > 0) {
			count--;
			sum += count;
		}
		System.out.println("The sum of all integers less than " + input + " is " + sum + ".");
	}


	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int input2 = inKey.nextInt();
		
		int max = Math.max(input1, input2) - 1;
		int min = Math.min(input1, input2);
		int sum = 0;
		
		while (max > min) {
			if (max % 2 == 0) {
				sum += max;
			}
			max--;
		}
		System.out.println("The sum of all even integers between " + 
					input1 + " and " + input2 + " is " + sum + ".");
		
	}


	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int input1 = inKey.nextInt();
		int count = input1;
		int sum = 0;
		
		while (count > 0) {
			
			System.out.print("Enter any integer: ");
			sum += inKey.nextInt();
			count--;
		}
		System.out.println("The sum of those " + input1 + 
						   " numbers is " + sum + ".");
		
	}


}
