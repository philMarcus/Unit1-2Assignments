/*
 * Unit 1 assignment option
 * by Marcus
 * 
 * Edit the final three println statements so that the input is converted into the other units correctly.
 * See example input/output. 
 *  
 *Then update the attributes and main method so at least 3 other SI prefixes are converted and displayed.
 */

import java.util.Scanner;

public class MilliCentiKilo {

	// define the SI prefix values
	final double MILLI = 0.001;
	final double CENTI = 0.01;
	final int KILO = 1000;

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);

		// prompt the user for input
		System.out.print("Enter the base units: ");
		String unit = kboard.next();
		System.out.print("How many " + unit + ": ");
		double num = kboard.nextDouble();

		// calculate and print conversions
		System.out.println(num + " " + unit + " is:");
		System.out.println("  milli" + unit);
		System.out.println("  centi" + unit);
		System.out.println("  kilo" + unit);
		
		kboard.close();
	}
}
