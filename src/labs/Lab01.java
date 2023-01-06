package labs;

public class Lab01 {

	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		problem5();
		
	}
	
	
	public static void problem1() {
	
		
		int i = 1;  //starting value
		
		while (i < 11) { //stop before 11
			System.out.print(i + " ");  //print i and a space
			i++;
		}
		System.out.println();  //final return
	}
	
	
	
	public static void problem2() {
		
		int i = -5;  //starting value
		
		while (i < 31) { //stop before 31
			System.out.print(i + " ");  //print i and a space
			i += 5;
		}
		System.out.println();  //final return
			
	}
	
	
	
	public static void problem3() {
		
		int i = 1000;  //starting value
		
		while (i > 0) { //stop at 0
			System.out.print(i + ", ");  //print i, and a space
			i /= 2;
		}
		System.out.println("0");  //final print without comma
		
	}
	
	
	
	public static void problem4() {
		
		int i = 2;  //starting value
		
		while (i < 64) { //stop at -64
			System.out.print(i + " ");  //print i, and a space
			i *= -2;
		}
		System.out.println("");  //final print 
		
	}
	
	
	
	public static void problem5() {
		
		int i = 2;  //starting value
		
		while (i < 35) { //stop at 34
			
			//Don't print multiples of 6
			if (i % 6 != 0) {
				System.out.print(i + " ");  //print i, and a space
			}
			i += 2;
		}
		System.out.println("");  //final print 
		
	}
	
	
	
}
