import java.util.Random;
import java.util.Scanner;

public class fileIO {
	
	public static int average(int...num) {
		int total=0;
		
		for(int x:num) 
			
			 total+=x;
			return total/num.length;
		
		
		
	
	}

	public static void display(int x[][]) {
		for(int i=0; i<x.length; i++) {
			
			for(int j=0;j<x[i].length;j++) {
				
				System.out.println(x[i][j]+ " \t");
			
		}
			System.out.println();
		}
	}
	public static void fileIO() {
		Scanner stdin = new Scanner(System.in); // Create the Scanner.

		double principal; // The value of the investment.
		double rate; // The annual interest rate.
		double interest; // The interest earned during the year.

		System.out.print("Enter the initial investment: ");
		principal = stdin.nextDouble();

		System.out.print("Enter the annual interest rate (as a decimal): ");
		rate = stdin.nextDouble();

		interest = principal * rate; // Compute this year's interest.
		principal = principal + interest; // Add it to principal.

		System.out.printf("The amount of interest is $%1.2f%n", interest);
		System.out.printf("The value after one year is $%1.2f%n", principal);

	} // end of main()

	public static void main(String[] args) {

		int firstarray[] =  { 1, 2, 3, 40 };
		int second[][] = { { 4, 33, 5, 3 }, { 2, 3, 5, 7 } };
		
		System.out.println(average(firstarray));
		
	}

}
