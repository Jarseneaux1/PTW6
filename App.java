package war;


public class App { //one deck each player is given 26 cards and they flip one over for round one the highest score wins the round or highest card

	public static void main(String[] args) {
		 Deck deck = new Deck(); // instantiate a new deck
	        deck.shuffle();

	        Player player1 = new Player("Player 1"); // instantiate two new players
	        Player player2 = new Player("Player 2");

	        for (int i = 0; i < 52; i++) { // draws from the deck for each player
	            if (i % 2 == 0) {
	                player1.draw(deck);
	            } else {
	                player2.draw(deck);
	            }
	        }

	        for (int i = 0; i < 26; i++) {
	            Card card1 = player1.flip(); // flips the card for each player
	            Card card2 = player2.flip();
	            

	                if (card1 != null && card2 != null) {
	                if (card1.getValue() > card2.getValue()) { //gets the value of each card and increments the score the value of each card
	                    player1.incrementScore();
	                } else if (card1.getValue() < card2.getValue()) {
	                    player2.incrementScore();
	                }
	            }
	        }

	        int player1Score = player1.getScore(); //gets the score for each player
	        int player2Score = player2.getScore();

	        System.out.println("Round 1:"); // prints to console end of round score and the score of each player
	        System.out.println("Player 1: " + player1Score);
	        System.out.println("Player 2: " + player2Score);
	        

	        if (player1Score > player2Score) {
	            System.out.println("Player 1 wins!"); //tells you who wins the round!
	        } else if (player1Score < player2Score) {
	            System.out.println("Player 2 wins!");
	        } else {
	            System.out.println("It's a tie!"); // if its a tie prints its a tie to console
	        }
	     // System.out.println(card.describe);
	     // System.out.println(hand.describe); was trying to use these to figure out why describe method isnt working
	     // System.out.println(deck.describe);
	    //   System.out.println(deck);
		
	}
	
}



