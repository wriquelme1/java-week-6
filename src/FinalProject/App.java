package FinalProject;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
*a) Instantiate a Deck and two Players, call the shuffle method on the deck.
*b) Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
*c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
*d) Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
*e) After the loop, compare the final score from each player. 
*f) Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

*/
public class App {
	 private final List<String> players = List.of("Sophia", "Benja", "Wil","Emma");
	 private Random random = new Random();
		  
	public static void main(String[] args) {
		 new App().run();
		
	}

	private void run() {
		List <String> names = new LinkedList<>(players);
		Player player1 = selectPlayer(names);
		Player player2 = selectPlayer(names);
		System.out.println(player1 + " and "+ player2+" are playing!!!");
		
		Deck  deck = new Deck();
		deck.shuffle();
		
		//System.out.println(deck);
		System.out.println();
		
		deal(deck, player1, player2);
		
		System.out.println(player1.getName()+" Hand of 26 cards: "+player1.getHand());
		System.out.println(player2.getName()+" Hand of 26 cards: "+player2.getHand());
		
		Play (player1, player2);
		
		theWinnerIs(player1,player2);
		
		
	}

	private void theWinnerIs(Player player1, Player player2) {
		if (player1.getScore() > player2.getScore()) {
			winner(player1);
			loser(player2);
		}else if (player2.getScore() > player1.getScore()){ 
			winner(player2);
			loser(player1);
		}else {
			tie (player1,player2);
		}
		
	}

	private void tie(Player player1, Player player2) {
		System.out.println(player1 + " and "+player2 +" tied with score: "+player1.getScore());
		
	}

	private void loser(Player player2) {
		System.out.println(player2 + " is the loser with score: "+player2.getScore());
		
	}

	private void winner(Player player1) {
		System.out.println(player1 + " is the winner with score: "+player1.getScore());
		
	}

	private void Play(Player player1, Player player2) {
		int turns = player1.getHand().size();
		
		for(int i=0; i<turns; i+=1) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			if(card1.getRank()> card2.getRank()) {
				player1.incrementScore();
			}else if(card2.getRank()> card1.getRank()) {
				player2.incrementScore();
			}
			
		}
		
	}

	private void deal(Deck deck, Player player1, Player player2) {
		int size = deck.size();
		for (int i = 0 ; i< size; i +=1) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
	}

	private Player selectPlayer(List<String> names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player (name);
	}
	
	 
}
