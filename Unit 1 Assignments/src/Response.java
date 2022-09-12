


//This class represents the results of a player guess, during construction the guess and the secret code are compared
//to determine the number of black and white pins.
//by Marcus

//Unit 1 assignment 1a and 1b are below in methods getNumEmpty and get NumPins


public class Response {
	private int numBlack=0;
	private int numWhite=0;
	private int len;
	
	// construct the response for a given code and secretcode.
	//Code and secretcode should be the same length.
	public Response(Code guess, Code secretCode) {
		len = guess.getLength();
		boolean[] matched = new boolean[len];
		for (int i=0; i < len; i++) {
	
			//
			//
			// TODO later in units 3 and 4!!!!
			//
			//
			
		}
	}
	
	//an empty response of numEmpty pins
	public Response(int numEmpty) {
	
		len = numEmpty;
	}
	
	// construct a response for testing and debugging purposes.
	public Response(int b, int w, int l) {
		numBlack = b;
		numWhite = w;
		len = l;
	
	
	public int getNumBlack() {
		return numBlack;
	}

	public int getNumWhite() {
		return numWhite;
	}
	
	public int getLength() {
		return len;
	}
	
	public int getNumEmpty() {
		// Part 1a)
		// This method should return the number of empty holes in a mastermind response. 
		//Use the attributes of the Response class: "len","numBlack", and "numWhite" to write
		//an expression to return this value. Look at the top of this class file to see the definitions
		//of each attribute. Place your expression after the "return" keyword on the next line.
		return //your code here///
	}

	public int getNumPins() {
		// Part 1b)
		// This method should return the total number of pins in a mastermind response. 
		//Use the attributes of the Response class to write an expression to return this value.
		return ///your code here///
	}

	public String toString() {
		return "Black Pins: " + numBlack + " White Pins: " + numWhite;
	}
}