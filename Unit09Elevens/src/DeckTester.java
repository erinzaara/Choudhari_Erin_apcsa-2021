/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck one = new Deck(new String[]{"A", "B", "C"}, new String[]{"Giraffes", "Lions"}, new int[]{2,1,6});
		System.out.println("Deck empty: " + one.isEmpty());
		System.out.println("Deck size: " + one.size());
		System.out.println("Card dealt: " + one.deal());
		System.out.println("Deck: " + one);
		System.out.println("");
		
		Deck two = new Deck(new String[]{"X", "Y"}, new String[]{"Apples", "Pears"}, new int[]{7,8});
		System.out.println("Deck empty: " + two.isEmpty());
		System.out.println("Deck size: " + two.size());
		System.out.println("Card dealt: " + two.deal());
		System.out.println("Deck: " + two);
		System.out.println("");
		
		Deck three = new Deck(new String[]{"G", "J"}, new String[]{"Books", "Games", "Toys"}, new int[]{4,6,8});
		System.out.println("Deck empty: " + three.isEmpty());
		System.out.println("Deck size: " + three.size());
		System.out.println("Card dealt: " + three.deal());
		System.out.println("Deck: " + three);
		System.out.println("");
		
		
		Deck four = new Deck(new String[]{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"}, new String[]{"hearts", "diamonds", "spades", "clubs"}, new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13});
		System.out.println("Unshuffled deck: " + four);;
		System.out.println("Card dealt: " + four.deal());
		System.out.println("Deck: " + four);
		four.shuffle();
		System.out.println("Shuffled deck: " + four);
	}
}
