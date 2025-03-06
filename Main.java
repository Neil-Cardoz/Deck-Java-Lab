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

            
}
