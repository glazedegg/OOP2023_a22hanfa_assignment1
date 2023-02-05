import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> listOfCards;
    
    String[] cardSuit = {"Diamonds", "Clubs", "Hearts", "Spades"};


    public Deck() {
        listOfCards = new ArrayList<Card>();
        int bonusValue;

        // Assign the cards suit and value
        for (int i = 0; i < cardSuit.length; i++) {
            if (cardSuit[i].equals("Diamonds")) {
                bonusValue = 4;
            } else if (cardSuit[i].equals("Clubs")) {
                bonusValue = 6;
            } else if (cardSuit[i].equals("Hearts")) {
                bonusValue = 8;
            } else {
                bonusValue = 10;
            }

            for (int j = 1; j <= 13; j++) {
                listOfCards.add(new Card(j, bonusValue, cardSuit[i]));
            }
        }    
    }
    
    public void shuffleCards() {
	 Collections.shuffle(listOfCards);
    }

    public Card getCard(int number) {
        return listOfCards.get(number);
    }
    
}
