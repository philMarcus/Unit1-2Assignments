/*
 * Unit 1 assignment option
 * by Marcus
 * 
Part 1 (1 point)
Complete the soccerStandings method so that it prints out the correct 
number of points for a team in the standings. 
Complete the americanFootballScore method so that it prints the correct score for a team. 
You may need to Google how football scores or soccer standings are calculated.

Test your program by running the main method. See example input/output.

Part 2 (1 point)
Update your methods and the main method so that your American Football 
score considers the number of safeties your team scored.
Update the main method so that it asks about your team’s goals for and goals against.
 Then update your soccerStandings method so it prints the goal differential.
 */

import java.util.Scanner;

public class Football {

	public static void americanFootballScore(int touchdowns, int xtraPoints, int fieldGoals, String team) {

	}

	public static void soccerStandings(int wins, int losses, int ties, String team) {

	}

	public static void main(String[] args) {
		// ask about an American football team and their touchdowns, extra points, field
		// goals
		Scanner kboard = new Scanner(System.in);
		System.out.println("American football team? ");
		String amTeam = kboard.next();
		System.out.println("How many touchdowns did they get? ");
		int td = kboard.nextInt();
		System.out.println("How many extra points did they have? ");
		int xp = kboard.nextInt();
		System.out.println("How many field goals did they make? ");
		int fg = kboard.nextInt();

		// calls your method to calculate and print the American Football score
		americanFootballScore(td, xp, fg, amTeam);

		// ask about a soccer team and their wins, losses, and ties
		System.out.println("\nSoccer team? ");
		String scTeam = kboard.next();
		System.out.println("How many wins do they have? ");
		int w = kboard.nextInt();
		System.out.println("How many losses do they have? ");
		int l = kboard.nextInt();
		System.out.println("How many ties do they have? ");
		int t = kboard.nextInt();

		// calls your method to calculate and print the soccer team's points in the
		// standings
		soccerStandings(w, l, t, scTeam);

		kboard.close();

	}

}
