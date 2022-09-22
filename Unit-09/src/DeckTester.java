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
		Deck d = new Deck(new String[] {"1", "2", "3", "4", "5"}, new String[] {"Clubs", "Diamond", "Spades", "Hearts"}, new int[]{1,2,3,4,5});
		System.out.println(d);
		
	//	d.deal();
	
	}
}
