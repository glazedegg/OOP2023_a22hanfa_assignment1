
public class Card {
    private int value;
    private String suit;
    private int bonus;

    public Card(int value,int bonus, String suit) {
        this.value = value;
        this.suit = suit;
        this.bonus = bonus;
    }

    public int getCard() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public int getBonus() {
        return bonus;
    }
    
    public int totalCardValue() {
	return value + bonus;
    }
}
