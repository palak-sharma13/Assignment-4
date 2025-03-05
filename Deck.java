// Defines the Card class representing a playing card.  
public class Card {      private String suit;      private String rank;  
 
    // Constructor to initialize a card with a given suit and rank      public Card(String suit, String rank) {  
        this.suit = suit;          this.rank = rank;  
    }  
 
    // Getter methods for suit and rank      public String getSuit() {          return suit;  
    }  
 
    public String getRank() {          return rank;  
    }  
 
    // Prints the card in a readable format      public void printCard() {  
        System.out.println(rank + " of " + suit);  
    }  
 
    // Checks if two cards have the same suit      public boolean sameCard(Card other) {          return this.suit.equals(other.suit);  
    }  
 
    // Checks if two cards have the same rank      public boolean compareCard(Card other) {          return this.rank.equals(other.rank);  
    }  
 
    // Returns a string representation of the card  
    @Override  
    public String toString() {          return rank + " of " + suit;  
    } 
} 
