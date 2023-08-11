package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	 private List<Card> cards;

	    public Deck() { //deck constructor that makes a list of card
	        cards = new ArrayList<>();
	        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
	        for (String suit : suits) {
	            for (int value = 2; value <= 14; value++) {
	                String name = numString(value) + " of " + suit;
	                cards.add(new Card(value, name));
	            }
	        }
	    }
	   

	    private String numString(int value) { // assigns a value to jack queen king ace and returns the value of it only if it is jack queen or king
	        if (value >= 11 && value <= 14) {
	            String[] values = {"Jack", "Queen", "King", "Ace"};
	            return values[value - 11];
	        }
	        return String.valueOf(value);
	    }

	    public void shuffle() { //shuffles the cards, learned this trick from java docs
	       Collections.shuffle(cards);
	    }

	    public Card draw() { // draws a card from the deck
	        if (!cards.isEmpty()) {
	            return cards.remove(0);
	        }
	        return null;
	    }
}





