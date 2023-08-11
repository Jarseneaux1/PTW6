package war;


public class Card {
	  private int value;
	    private String name;

	    public Card(int value, String name) { // constructor for the card value and name or number and suit
	        this.value = value;
	        this.name = name;
	    }

	    public int getValue() { //get the value of a card
	        return value;
	    }

	    public String getName() { //gets the name or suit of a card
	        return name;
	    }

	    public String describe() { //describes a card 
	        return value + " of " + name;
	    }
}
