
/*Unit 1 assignment option
 * by Marcus
 * 
 *Use compound assignment operators to correctly update money after each user prompt. 
 *Assign the appropriate rounded value to nearestDollar. 
 *Add working lines of code for nickels and dimes, and for the other sized bills.
*Test thoroughly, see example input/output.
 */
import java.util.Scanner;

public class MoneyLeft {

	public static void main(String[] args) {

		Scanner kboard = new Scanner(System.in);
		double money = 0;

		System.out.println("How many pennies do you have?");
		//
		System.out.println("How many quarters do you have?");
		//
		System.out.println("How many one dollar bills do you have");
		money += kboard.nextInt();
		System.out.println("How many five dollar bills do you have?");
		//
		System.out.println("How many dollars will you SPEND?");
		//
		System.out.println("\nYou'll have exactly" + money + " left.");

		// int nearestDollar =
		System.out.println("Rounded that's " + nearestDollar + "bucks!");

		kboard.close();

	}

}
