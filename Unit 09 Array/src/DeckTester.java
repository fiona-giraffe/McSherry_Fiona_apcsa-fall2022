/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println("   toString:\n" + d.toString());
		System.out.println("   isEmpty: " + d.isEmpty());
		System.out.println("   size: " + d.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println("   deal: " + d.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("   toString:\n" + d.toString());
		System.out.println("   isEmpty: " + d.isEmpty());
		System.out.println("   size: " + d.size());
		System.out.println();
		System.out.println();
		
		int s = d.size();
		while(s > 0) {
			d.deal();
			s--;
		}
		
		System.out.println("**** Deal From Empty Deck ****");
		System.out.println("   deal: " + d.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Shuffle cards ****");
		System.out.println();
		Deck e = new Deck(ranks, suits, pointValues);
		e.shuffle();
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println("   toString:\n" + e.toString());
		System.out.println("   isEmpty: " + e.isEmpty());
		System.out.println("   size: " + e.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println("   deal: " + e.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("   toString:\n" + e.toString());
		System.out.println("   isEmpty: " + e.isEmpty());
		System.out.println("   size: " + e.size());
		System.out.println();
		System.out.println();  
	}
}
