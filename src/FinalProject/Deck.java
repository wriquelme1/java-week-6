package FinalProject;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*b. Deck
b.i. Fields
 b.i.1. cards (List of Card)
b.ii. Methods
 b.ii.1. shuffle (randomizes the order of the cards)
 b.ii.2. draw (removes and returns the top card of the Cards field)
 b.ii.3. In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/

@SuppressWarnings("serial")
public class Deck extends LinkedList<Card> {

	private final List<String> cardNames = List.of("Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Jack", "Queen", "King", "Ace");

	private final List<String> domains = List.of("Hearts", "Clubs", "Spades", "Diamonds");
	
	public Deck() {
		for (int i= 0; i < cardNames.size(); i ++ ) {
			int rank = i + 1;
			String cName = cardNames.get(i);
			for(String domain : domains) {
				add(new Card(cName, domain, rank));
			}
		}
	}

	public void shuffle() {

		Collections.shuffle(this);
		
	}

	@Override
	public String toString() {
		StringBuilder st = new StringBuilder();
		st.append("Deck: ").append(System.lineSeparator());
		for(int pos=0; pos < size(); pos ++) {
			st.append(get(pos)).append(System.lineSeparator());
			
			
		}
		return st.toString();
	}
	

}
