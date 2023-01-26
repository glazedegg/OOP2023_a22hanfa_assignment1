
public class Card {
    private int value;
    private int bonus;
    private String suit;

    public Card(int value, int bonus, String suit) {
        this.value = value;
        this.bonus = bonus;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public int getBonus() {
        return bonus;
    }

    public String getSuit() {
        return suit;
    }
}
