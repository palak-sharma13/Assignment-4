// Menu-driven program to interact with the deck of cards.  
import java.util.Scanner;  public class Main {      public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);          Deck deck = new Deck();  
        int choice;          do {  
            // Display menu  
            System.out.println("\nCard Deck Operations:");  
            System.out.println("1. Print Deck");  
            System.out.println("2. Shuffle Deck");              System.out.println("3. Find Card");  
            System.out.println("4. Deal 5 Cards");  
            System.out.println("5. Exit");  
            System.out.print("Enter your choice: ");  
              
            choice = scanner.nextInt();              scanner.nextLine(); // Consume newline  
  
            switch (choice) {                  case 1:  
                    System.out.println("\nPrinting deck:");                      deck.printDeck();  
                    break;                  case 2:  
                    deck.shuffleDeck();  
                    System.out.println("Deck shuffled.");  
                    break;                  case 3:  
                    System.out.print("Enter rank (e.g., Ace, 2, King): ");  
                    String rank = scanner.nextLine();  
                    System.out.print("Enter suit (Hearts, Diamonds, Clubs, Spades): ");                      String suit = scanner.nextLine();  
  
                    if (deck.findCard(rank, suit)) {  
                        System.out.println("Card is in the deck.");  
                    } else {  
                        System.out.println("Card not found.");  
                    }                      break;                  case 4:                      deck.dealCard();  
                    break;                  case 5:  
                    System.out.println("Exiting program.");  
                    break;                  default:  
                    System.out.println("Invalid choice. Try again.");  
            }  
        } while (choice != 5);          scanner.close();  
    }  
} 
