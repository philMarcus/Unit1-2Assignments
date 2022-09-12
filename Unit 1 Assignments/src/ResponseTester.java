
//Test class for Response
//by Marcus
public class ResponseTester {

	public static void main(String[] args) {
		// create test responses
		Response test1 = new Response(0, 0, 4);
		Response test2 = new Response(2, 1, 4);
		Response test3 = new Response(3, 1, 4);
		Response test4 = new Response(0, 4, 4);
		Response test5 = new Response(1, 1, 5);

		// test methods of Response class
		//make sure to add code so Responses test3 through test5 are tested as well.
		// compare your output to the expected out in the assignment menu.
		
		System.out.println(test1.getNumBlack() + " Black");
		System.out.println(test1.getNumWhite() + " White");
		System.out.println(test1.getNumPins() + " Total");
		System.out.println(test1.getNumEmpty() + " Empty\n");

		System.out.println(test2.getNumBlack() + " Black");
		System.out.println(test2.getNumWhite() + " White");
		System.out.println(test2.getNumPins() + " Total");
		System.out.println(test2.getNumEmpty() + " Empty\n");

	}

}
