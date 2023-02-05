import java.util.Scanner;

/*
 * Your assignment is to write a console application where the user plays “Lucky Card” game. 
 * This is a simple game, where a card deck is shuffled and then placed in a heap. Each card has a value computed as follows:   
 * value of the card + bonus of the card, where the bonus is 4 for diamonds, 6 for clubs, 8 for hearts and 10 for spades. 
 * In each round of the game, you draw three cards in sequence from the top of the deck. 
 * If the third card’s value is between the first two card values, then you win! 
 * If the third card is equal to either of the first two cards, or is outside of the set of values between the first two card values, then you lose! 
 */
public class Game {

    public static void main(String[] args) {
	
	System.out.println("Welcome to Lucky Card game by Hannes Fahlin!");
	
	// Initialise variables
	boolean stillPlaying =true;
	
	Deck deck = new Deck();
        
	int firstCard, secondCard, thirdCard;
        
	int firstCardBonus, secondCardBonus, thirdCardBonus;
        
	String firstCardSuit, secondCardSuit, thirdCardSuit;
        
	// While-loop for the game sequence
	while(stillPlaying) {
	    
	    // Shuffle deck
	    deck.shuffleCards();
	    
            // Draw three cards, value, suit and bonus.
            firstCard = deck.getCard(0).getCard();
            secondCard = deck.getCard(1).getCard();
            thirdCard = deck.getCard(2).getCard();
            
            firstCardBonus = deck.getCard(0).getBonus(); 
            secondCardBonus = deck.getCard(1).getBonus(); 
            thirdCardBonus = deck.getCard(2).getBonus();
            
            firstCardSuit = deck.getCard(0).getSuit(); 
            secondCardSuit = deck.getCard(1).getSuit(); 
            thirdCardSuit = deck.getCard(2).getSuit();
            
            // Display the cards
            System.out.println("First card: " + firstCardSuit + ": " + firstCard + " -> Value = " + (firstCard + firstCardBonus));
            System.out.println("Second card: " + secondCardSuit + ": " + secondCard + " -> Value = " + (secondCard + secondCardBonus));
            System.out.println("Third card: " + thirdCardSuit + ": " + thirdCard + " -> Value = " + (thirdCard + thirdCardBonus));

            // Check if the player wins or loses
            if ((thirdCard + thirdCardBonus)> (firstCard + firstCardBonus) && (thirdCard + thirdCardBonus) < (secondCard + secondCardBonus)) {
                System.out.println("You win!");
                
            } else {
                System.out.println("You lose!");
                
            }
            
            // Check if the player wants to play another round
            System.out.println("Press: \"Enter\" to continue, or press \"q\" to quit.");
            
            Scanner scannerInput = new Scanner(System.in);
            
            String answerInput = scannerInput.nextLine();

            if (answerInput.equals("q")) {
        	stillPlaying = false;
        	
        	System.out.println("Thank you for playing and welcome back!");
        	
        	scannerInput.close();
            }
	}
    }

}
