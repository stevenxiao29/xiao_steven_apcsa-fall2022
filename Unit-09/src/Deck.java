import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = ranks.length * suits.length;
		
		cards = new Card[size];
		
		for(int i=0; i<ranks.length; i++) {
			for(int j=0; j<suits.length; j++) {
				cards[ranks.length*j+i] = new Card(ranks[i], suits[j], values[i]);
			}
		}
		System.out.println("something");
		System.out.println(toString());
		System.out.println("something  21111232");
		shuffle();
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0) {
			return true;
		}else {
			return false;
		}
		
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		Card[] shuffled = new Card[size];
		int j = 0;
		int[] repeat = new int[size];
		
		// init repeat array with value -1 to start
		for (int q = 0; q<repeat.length ; q++) {
			//	System.out.println(shuffled[j]);
			repeat[q] = -1;
		}
		
		for (int i = 0; i<size ; i++){
			
			j = (int) (Math.random()*size);
	//		System.out.println("j: " + j);
			
			for(int x = 0 ; x<size; x++) {
				System.out.println("    repeat[x] " + x + " - " + repeat[x]);

				while (repeat[x] == j) {
					j  = (int) (Math.random()*size);
				}
				repeat[i] = j;
				break;
				
			}
			shuffled[i] = cards[j];
		//	System.out.print("shuffled: " );
			//printArray(shuffled);
			//System.out.print("repeat: " );
		//	printArray(repeat);
			
		}

		// copy shuttled value back to original values	
		for (int q = 0; q<shuffled.length ; q++) {
			//	System.out.println(shuffled[j]);
			cards[q] = shuffled[q];
		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Card a = cards[size-1];
		size--;
		
		return a;
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}