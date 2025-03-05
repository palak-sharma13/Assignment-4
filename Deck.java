// Defines the Deck class that manages a deck of cards.  
  
import java.util.ArrayList;  import java.util.Collections;  import java.util.Random;  
  
public class Deck {      private ArrayList<Card> deck;  
  
    // Constructor that initializes the deck with 52 cards      public Deck() {          deck = new ArrayList<>();          createDeck();  
    }  
  
    // Creates a standard deck of 52 cards      public void createDeck() {  
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};  
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};          deck.clear(); // Ensuring deck is empty before creation  
  
        for (String suit : suits) {              for (String rank : ranks) {                  deck.add(new Card(suit, rank));  
            }  
        }  
    }  
  
    // Prints all cards in the deck      public void printDeck() {          for (Card card : deck) {              card.printCard();  
        }  
    }  
  
    // Searches for a specific card in the deck      public boolean findCard(String rank, String suit) {          for (Card card : deck) {  
            if (card.getRank().equalsIgnoreCase(rank) && card.getSuit().equalsIgnoreCase(suit)) {  
                return true;  
            }  
        }  
        return false;  
    }  
  
    // Shuffles the deck randomly      public void shuffleDeck() {  
        Collections.shuffle(deck);  
    }  
  
    // Deals 5 random cards from the deck      public void dealCard() {          Random rand = new Random();  
        if (deck.size() < 5) {  
            System.out.println("Not enough cards to deal.");  
            return;  
        }  
        System.out.println("Dealing 5 random cards:");  
        for (int i = 0; i < 5; i++) {  
            Card card = deck.get(rand.nextInt(deck.size()));              card.printCard();  
        }  
    }  
} 
