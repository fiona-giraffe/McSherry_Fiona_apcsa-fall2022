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
		Card one = new Card("4", "Spades", 4);
		Card two = new Card("2", "Hearts", 2);
		Card three = new Card("4", "Spades", 4);
		
		System.out.println("One matches two? " + one.matches(two));
		System.out.println("One matches three? " + one.matches(three));    
		System.out.println("Suit of Card One: " + one.suit());
		System.out.println("Card one: " + one.toString());
	}
}
