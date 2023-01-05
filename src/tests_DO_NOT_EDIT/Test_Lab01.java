package tests_DO_NOT_EDIT;

import org.junit.jupiter.api.*;
import labs.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

class Test_Lab01 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "Problem #1";
		String expectedOutput = "1 2 3 4 5 6 7 8 9 10";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem1();
		
		inOut.resetSystem();
		
		try {
			Assertions.assertTrue(inOut.getOutputStream().contains(expectedOutput));
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
			
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Expected output: " + expectedOutput 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			
			Assertions.fail();
		}
	}

	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "Problem #2";
		String expectedOutput = "-5 0 5 10 15 20 25 30";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem2();
		inOut.resetSystem();
		
		try {
			Assertions.assertTrue(inOut.getOutputStream().contains(expectedOutput));
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Expected output: " + expectedOutput 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "Problem #3";
		String expectedOutput = "1000, 500, 250, 125, 62, 31, 15, 7, 3, 1, 0";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem3();
		inOut.resetSystem();
		
		try {
			Assertions.assertTrue(inOut.getOutputStream().contains(expectedOutput));
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Expected output: " + expectedOutput 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "Problem #4";
		String expectedOutput = "2 -4 8 -16 32 -64";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem4();
		inOut.resetSystem();
		
		try {
			Assertions.assertTrue(inOut.getOutputStream().contains(expectedOutput));
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Expected output: " + expectedOutput 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			Assertions.fail();
		}
	}
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "Problem #5";
		String expectedOutput = "2 4 8 10 14 16 20 22 26 28 32 34";
		
		inOut.resetOutputStream();
		inOut.overridePrintStatements();
		Lab01.problem5();
		inOut.resetSystem();
		
		try {
			Assertions.assertTrue(inOut.getOutputStream().contains(expectedOutput));
			
			System.out.println("Test " + problemNumber + ": Passed all tests\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Expected output: " + expectedOutput 
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			Assertions.fail();
		}
	}
	

	
}
