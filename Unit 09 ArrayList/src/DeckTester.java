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
		
		 
		System.out.println("****    Deck Two    ****");
		System.out.println();
		System.out.println();
		
		
		String[] ranks2 = {"ace", "two", "three", "four"};
		String[] suits2 = {"black", "red"};
		int[] pointValues2 = {1, 2, 3, 4};
		Deck a = new Deck(ranks2, suits2, pointValues2);
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println("   toString:\n" + a.toString());
		System.out.println("   isEmpty: " + a.isEmpty());
		System.out.println("   size: " + a.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println("   deal: " + a.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("   toString:\n" + a.toString());
		System.out.println("   isEmpty: " + a.isEmpty());
		System.out.println("   size: " + a.size());
		System.out.println();
		System.out.println();
		
		int y = a.size();
		while(y > 0) {
			a.deal();
			y--;
		}
		
		System.out.println("**** Deal From Empty Deck ****");
		System.out.println("   deal: " + a.deal());
		System.out.println();
		System.out.println();
		
		
		System.out.println("****    Deck Three    ****");
		System.out.println();
		System.out.println();
		
		
		String[] ranks3 = {"ace", "two", "three"};
		String[] suits3 = {"black", "red", "blue"};
		int[] pointValues3 = {1, 2, 3};
		Deck c = new Deck(ranks3, suits3, pointValues3);
		
		System.out.println("**** Original Deck Methods ****");
		System.out.println("   toString:\n" + c.toString());
		System.out.println("   isEmpty: " + c.isEmpty());
		System.out.println("   size: " + c.size());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deal a Card ****");
		System.out.println("   deal: " + c.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("   toString:\n" + c.toString());
		System.out.println("   isEmpty: " + c.isEmpty());
		System.out.println("   size: " + c.size());
		System.out.println();
		System.out.println();
		
		int z = c.size();
		while(z > 0) {
			c.deal();
			z--;
		}
		
		System.out.println("**** Deal From Empty Deck ****");
		System.out.println("   deal: " + c.deal());
		System.out.println();
		System.out.println();
		
		System.out.println("**** Shuffled Deck ****");
		System.out.println();
		System.out.println();
		
		String[] suits4 = {"Hearts","Diamonds","Spades","Clubs"};
	    int[] pointValues4 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    String[] ranks4 = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	    Deck cards = new Deck(ranks4,suits4,pointValues4);
	    cards.shuffle();
	    System.out.println(cards);
	}
}
