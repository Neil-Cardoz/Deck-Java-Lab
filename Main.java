// Main.java
//Name - Neil Cardoz	
//PRN - 23070126079	
//Batch - AIML B1


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.createDeck(); // Initialize the deck with cards
	
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Random Card");
            System.out.println("3. Find a Card");
            System.out.println("4. Shuffle Deck");
            System.out.println("5. Deal 5 Random Cards");
            System.out.println("6. Compare Two Cards");
            System.out.println("7. Check if Two Cards Have the Same Suit");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
		
		
			switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    deck.printCard();
                    break;
                case 3:
                    System.out.print("Enter card rank: ");
                    String rank = scanner.next();
                    System.out.print("Enter card suit: ");
                    String suit = scanner.next();
                    deck.findCard(rank, suit);
                    break;
                case 4:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled successfully.");
                    break;
                case 5:
                    deck.dealCard();
                    break;
                case 6:
                    System.out.println("Enter details for the first card:");
                    System.out.print("Rank: ");
                    String rank1 = scanner.next();
                    System.out.print("Suit: ");
                    String suit1 = scanner.next();

                    System.out.println("Enter details for the second card:");
                    System.out.print("Rank: ");
                    String rank2 = scanner.next();
                    System.out.print("Suit: ");
                    String suit2 = scanner.next();

                    boolean sameRank = deck.compareCard(new Card(rank1, suit1), new Card(rank2, suit2));
                    System.out.println("Do the cards have the same rank? " + sameRank);
                    break;
                case 7:
                    System.out.println("Enter details for the first card:");
                    System.out.print("Rank: ");
                    String r1 = scanner.next();
                    System.out.print("Suit: ");
                    String s1 = scanner.next();

                    System.out.println("Enter details for the second card:");
                    System.out.print("Rank: ");
                    String r2 = scanner.next();
                    System.out.print("Suit: ");
                    String s2 = scanner.next();

                    boolean sameSuit = deck.sameCard(new Card(r1, s1), new Card(r2, s2));
                    System.out.println("Do the cards have the same suit? " + sameSuit);
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);
        scanner.close();
    }
            
}
