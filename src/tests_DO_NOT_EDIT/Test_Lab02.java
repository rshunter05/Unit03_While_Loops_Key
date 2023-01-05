package tests_DO_NOT_EDIT;

import org.junit.jupiter.api.*;
import labs.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Test_Lab02 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}

	
	@Test
	@DisplayName("Test problem1()")
	void test1() {
		String problemNumber = "Problem #1";
		String[][] tests = {{"1", "The sum of all integers less than 1 is 0."},
							{"5", "The sum of all integers less than 5 is 10."},
							{"47", "The sum of all integers less than 47 is 1081."},
							{"348", "The sum of all integers less than 348 is 60378."},
							};
		int i = 0;
		
		String output = "";
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem01();
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0]
					+ "\n   Expected output: " + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test problem2()")
	void test2() {
		String problemNumber = "Problem #2";
		String[][] tests = {{"4\n12", "The sum of all even integers between 4 and 12 is 24."},
							{"3\n17", "The sum of all even integers between 3 and 17 is 70."},
							{"-5\n5", "The sum of all even integers between -5 and 5 is 0."},
							{"-8\n247", "The sum of all even integers between -8 and 247 is 15240."},
							};
		int i = 0;
		
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0]);
				Lab02.problem02();
				assertTrue(inOut.getOutputStream().contains(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0]
					+ "\n   Expected output: " + tests[i][1] 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test problem3()")
	void test3() {
		
		String randInput = "";
		int randTotal = 0;
		int randNum = 0;
		for (int i = 0; i < 18; i++) {
			randNum = (int) (Math.random() * 250) - 100;
			randInput += "" + randNum + "\n";
			randTotal += randNum;
		}
		
		
		
		String problemNumber = "Problem #3";
		String[][] tests = {{"3", "3\n12\n-2", "13"},
							{"5", "5\n16\n57\n24\n-14", "88"},
							{"15", "5\n-4\n95\n-15\n-18\n48\n654\n-125\n15\n3\n-4\n-8\n-159\n24\n16\n-4\n-8\n5", "527"},
							{"18", randInput, String.valueOf(randTotal)},
							};
		int i = 0;
		
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][0] + "\n" + tests[i][1]);
				Lab02.problem03();
				assertTrue(inOut.getOutputStream().contains("The sum of those " + tests[i][0] 
														  + " numbers is " + tests[i][2] + "."));
						
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + tests.length + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + tests.length
					+ "\n   Input tested: " +  tests[i][0] + " inputs\n" + tests[i][1]
					+ "\n   Expected output: " + " The sum of those " + tests[i][0] 
							  + " numbers is " + tests[i][2] + "."
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	
}
