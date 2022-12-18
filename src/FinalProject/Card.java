package FinalProject;
/*a. Card
*a.i. Fields
 *a.i.1. value (contains a value from 2-14 representing cards 2-Ace)
 *a.i.2. name (e.g. Ace of Diamonds, or Two of Hearts)
*a.ii. Methods
 *a.ii.1. Getters and Setters
 *a.ii.2. describe (prints out information about a card)
*/

public class Card {

	private String cName;
	private String domain;
	private  int rank;

	public Card(String cName, String domain, int rank) {

		this.cName=cName;
		this.domain=domain;
		this.rank=rank;
		
	}

	@Override
	public String toString() {
		
		return cName + " " + domain;
	}

	public int getRank() {
		return rank;
	}
}