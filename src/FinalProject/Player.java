package FinalProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*c. Player
*c.i. Fields
* c.i.1. hand (List of Card)
* c.i.2. score (set to 0 in the constructor)
 *c.i.3. name
*c.ii. Methods
 *c.ii.1. describe (prints out information about the player and calls the describe method for each card in the Hand List)
* c.ii.2. flip (removes and returns the top card of the Hand)
* c.ii.3. draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
* c.ii.4. incrementScore (adds 1 to the Player’s score field)
*/
public class Player {
	
	private String name;
	private  List<Card> hand = new LinkedList<Card>();
	private int score=0;
	
	public Player(String name) {
	    this.name = name;
	}

	@Override
	public String toString() {
	
		return name;
	}

	public void draw(Deck deck) {
		
	hand.add(deck.remove(0));
		
	}

	public List<Card> getHand() {
		
		return hand;
	}

	public String getName() {
		return name;
	}

	public Card flip() {
		return hand.remove(0);
	}

	public void incrementScore() {
		score += getScore() + 1;
		
	}

	public int getScore() {
		return score;
	}


	  

}
