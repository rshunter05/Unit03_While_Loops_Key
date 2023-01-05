package tests_DO_NOT_EDIT;

import org.junit.jupiter.api.*;
import labs.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Test_Lab03 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	
	@Test
	@DisplayName("Test problem1()")
	void test1() {
		String problemNumber = "Problem #1";
		String[][] tests = {{"" + Lab03.pin + "\n-5555\n-6666", "Access Granted", "Account Locked", 
									"Should have gained access on first try."},
							{"-5555\n" + Lab03.pin + "\n-7777", "Access Granted", "Account Locked", 
									"Should have gained access on second try."},
							{"-5555\n-6666\n" + Lab03.pin, "Access Granted", "Account Locked", 
									"Should have gained access on thrid try."},
							{"-5555\n-6666\n-7777", "Account Locked", "Access Granted", 
									"All three tries wrong.  Account should be blocked."}
							};
		int i = 0;
		
		boolean hasCorrect = false;
		boolean doesNotHaveIncorrect = false;
		
		try {
			for (; i < tests.length; i++) {
				hasCorrect = false;
				doesNotHaveIncorrect = false;
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab03.problem01();
				hasCorrect = inOut.getOutputStream().contains(tests[i][1]);
				doesNotHaveIncorrect = !inOut.getOutputStream().contains(tests[i][2]);
				assertTrue(hasCorrect);
				assertTrue(doesNotHaveIncorrect);
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			
			String hint = "";
			
			if (!hasCorrect) {
				hint += "\n      You didn't tell user: \"" + tests[i][1] + "\"";
			}
			if (!hasCorrect) {
				hint += "\n      You should not have told the user: \"" + tests[i][2] + "\"";
			}
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input(s) tested: " +  tests[i][0]
					+ "\n   Expected output: " + tests[i][1] 
					+ "\n   Hints:" + tests[i][3] + hint
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}

	
	
	
	
	@Test
	@DisplayName("Test problem2()")
	void test2() {
		
		int count = (int)(Math.random() * 500) + 1;
		double num = 0;
		String input = "";
		double sum = 0.0;
		for (int i = 0; i < count; i++) {
			num = Math.random() * 51 - 25;
			input += num + "\n";
			sum += num;
		}
		input += "0";
		
		
		String problemNumber = "Problem #2";
		String[][] tests = {{"5\n91\n-5\n2.4\n0", "entered 4 ", "93.4"},
							{"9.8\n159\n-95416\n351\n-59.15\n0", "entered 5 ", "-94955.34999999999"},
							{input, "entered " + count + " ", String.valueOf(sum)},
							};
		int i = 0;
		
		boolean hasCount = false;
		boolean hasSum = false;
		
		try {
			for (; i < tests.length; i++) {
				hasCount = false;
				hasSum = false;
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab03.problem02();
				hasCount = inOut.getOutputStream().contains(tests[i][1]);
				hasSum = inOut.getOutputStream().contains(tests[i][2]);
				assertTrue(hasCount);
				assertTrue(hasSum);
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
//			System.out.println(tests[i-1][0]);
//			System.out.println("You " + tests[i-1][1] + "numbers that add up to " + tests[i-1][2] + ".");
		}
		catch (AssertionError e){
			inOut.resetSystem();
			
			String hint = "";
			
			if (!hasCount) {
				hint += "\n      Input Count Wrong.  Should be: " + tests[i][1].substring(8);
			}
			if (!hasSum) {
				hint += "\n      Sum Wrong.  Should be: " + tests[i][2];
			}
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input(s) tested: " +  tests[i][0]
					+ "\n   Expected output: " + "You " + tests[i][1] + "numbers that add up to " + tests[i][2] + "." 
					+ "\n   Hints:" + hint
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	
	@Test
	@DisplayName("Test problem3()")
	void test3() {
		
		int count = (int)(Math.random() * 500) + 200;
		String input = "";
		char letter = 0;
		double sum = 0.0;
		for (int i = 0; i < count; i++) {
			letter = (char) (Math.random() * 12 + 97);
			input += letter + "\n";
		}
		input += "y";
		
		
		String problemNumber = "Problem #3";
		String[][] tests = {{"y", "1"},
							{"Y", "1"},
							{"yes", "1"},
							{"YES", "1"},
							{"yellow", "1"},
							{"no", "1"},
							{"No", "1"},
							{"nope", "1"},
							{"nutella", "1"},
							{"blue\ngreen\n2\n45\nyes", "5"},
							{"hello there\ny", "2"},
							{input, String.valueOf(count + 1)},
							};
		int i = 0;
		
		boolean correctThankYou = false;
		boolean correctInvalid = false;
		int thankYouCount = 0;
		int invalidCount = 0;
		
		try {
			for (; i < tests.length; i++) {
				correctThankYou = false;
				correctInvalid = false;
				thankYouCount = 0;
				invalidCount = 0;
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab03.problem03();
				
				int nextIndex = 0;
				while (nextIndex >= 0) {
					nextIndex = inOut.getOutputStream().indexOf("Thank you!", nextIndex + 1);
					if (nextIndex >=0) {
						thankYouCount++;
					}    
				}
				nextIndex = 0;
				while (nextIndex >= 0) {
					nextIndex = inOut.getOutputStream().indexOf("Invalid Response", nextIndex + 1);
					if (nextIndex >=0) {
						invalidCount++;
					}    
				}
				correctThankYou = 1 == thankYouCount;
				correctInvalid = Integer.valueOf(tests[i][1]) - 1 == invalidCount;
				assertTrue(correctThankYou);
				assertTrue(correctInvalid);
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
		
		}
		catch (AssertionError e){
			inOut.resetSystem();
			
			String hint = "";
			
			if (!correctThankYou) {
				hint += "\n      You thanked the user more than once.";
			}
			if (!correctInvalid) {
				hint += "\n      You should have said \"Invalid Response\" "
						      + (Integer.valueOf(tests[i][1]) - 1) + " time(s)";
			}
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input(s) tested: " +  tests[i][0]
					+ "\n   Expected output: 1 Thank you and " + (Integer.valueOf(tests[i][1]) - 1) + "Invalid Responses" 
					+ "\n   Hints:" + hint
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	@Test
	@DisplayName("Test problem4()")
	void test4() {
		
		double deterioration = Math.random() * 10;
		double threshold = Math.random() * 40 + 20;
		
		
		String problemNumber = "Problem #4";
		String[][] tests = {{"10", "50"},
							{"8.7", "35.8"},
							{"1.3", "12.6"},
							{String.valueOf(deterioration), String.valueOf(threshold)}
							};
		int i = 0;
		String expectedCycles = "";
		String expectedOutput = "";
		boolean correctRemaining = false;
		boolean correctCycles = false;
		int countCycles = 0;
		double current = 100.0;
		
		
		try {
			for (; i < tests.length; i++) {
				expectedCycles = "";
				expectedOutput = "";
				correctRemaining = false;
				correctCycles = false;
				countCycles = 0;
				current = 100.0;
				
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0] + "\n" + tests[i][1]);
				Lab03.problem04();
				
				expectedOutput += "       Cycle #      % Remaining\n"
						        + "      --------------------------\n";
				
				boolean foundBadRemaining = false;
				while (current >= Double.valueOf(tests[i][1]) ) {
					countCycles++;
					current -= current * (Double.valueOf(tests[i][0]) / 100.0);
					
					expectedOutput += String.format(
							"       %3d             %6.3f%n"
							, countCycles, current);
					
					if (!foundBadRemaining) {
						foundBadRemaining = true;
						correctRemaining = inOut.getOutputStream().contains(String.format("%.3f",current));
					}
					
				}
				
				expectedCycles = "Replace after " + countCycles + " cycles";
				correctCycles = inOut.getOutputStream().contains(expectedCycles);
				
				expectedOutput += "      " + expectedCycles;
				
				assertTrue(correctRemaining);
				assertTrue(correctCycles);
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
		
		}
		catch (AssertionError e){
			inOut.resetSystem();
			
			String hint = "";
			
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input(s) tested: "  
					+ "\n      Deterioration: " + tests[i][0]
					+ "\n      Lower Threshold: " + tests[i][1]
					+ "\n   Expected output should include these percents and cycle count: "
					+ "\n" + expectedOutput
//					+ "\n   Hints:" + hint
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	
}
