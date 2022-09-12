// Unit 1 Assignment Option
//by Litvin
/*
 * Fillin the blanks in a short class FeetToInches with one
 * static method toInches and the main method. main prompts
 * the user to enter her height in feet and inches, calls
 * toInches, and displays the returned height in inches
 */

import java.util.Scanner;

public class FeetToInches
{
  public static int toInches(int feet, int inches)
  {

    ______________________________ ;
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Feet: ");
    int feet = kboard.nextInt();

    System.out.print("Inches: ");
    int inches = kboard.nextInt();

    kboard.close();

    int totalInches = _________________________________________ ;

    System.out.println(feet + " feet and " + inches + " inches = " + totalInches + " inches");
  }
}
