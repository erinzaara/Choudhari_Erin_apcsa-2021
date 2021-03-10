/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("ace", "hearts", 1);
		System.out.println("Card 1 test");
		System.out.println(one.rank());
		System.out.println(one.suit());
		System.out.println(one.pointValue());
		System.out.println(one.toString());
		System.out.println("");
		
		
		Card two = new Card("3", "spades", 3);
		System.out.println("Card 2 test");
		System.out.println(two.rank());
		System.out.println(two.suit());
		System.out.println(two.pointValue());
		System.out.println(two.toString());
		System.out.println("");
		
		Card three = new Card("3", "spades", 3);
		System.out.println("Card 3 test");
		System.out.println(three.rank());
		System.out.println(three.suit());
		System.out.println(three.pointValue());
		System.out.println(three.toString());
		System.out.println("");
		
		System.out.println("Card 1 matches Card 2: " + one.matches(two));
		System.out.println("Card 2 matches Card 3: " + two.matches(three));
		System.out.println("Card 3 matches Card 1: " + three.matches(one));
	}
}
