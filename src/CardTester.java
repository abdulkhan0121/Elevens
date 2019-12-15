package Elevens;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card one = new Card("King", "spades", 9);
		Card two = new Card("Queen", "Diamonds", 8);
		Card three = new Card("Ace", "spades", 8);

		System.out.print(one.toString());
		
	}
}
