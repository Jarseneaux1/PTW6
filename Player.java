package war;

import java.util.ArrayList;
import java.util.List;
public class Player {
	  private List<Card> hand;
	    private int score;
	    private String name;

	    public Player(String name) { //constructor for the player also creates a hand for the player and sets score to zero
	        hand = new ArrayList<>();
	        score = 0;
	        this.name = name;
	    }

	 //   public void describe() { // Show what cards are in the players hand i cannot get this to work for some reason
	     //   System.out.println(name + "'s hand:");
	     //   for (Card card : hand) {
	      //      card.describe();
	     //   }
	  //  }

	    public Card flip() { //flip the top card on the deck
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        }
	        return null;
	    }

	    public void draw(Deck deck) { //draw from the deck
	        Card drawnCard = deck.draw();
	        if (drawnCard != null) {
	            hand.add(drawnCard);
	        }
	    }

	    public void incrementScore() { //increase score for a player
	        score++;
	    }

	    public int getScore() { //get the score for a player
	        return score;
	    }
	
}

