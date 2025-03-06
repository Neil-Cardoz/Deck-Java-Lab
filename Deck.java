//Deck.java

import java.util.*;

class Deck {
	ArrayList<Card> deck;
	
	public Deck(){
		deck = new ArrayList<>();	
	}
	
	public void createDeck(){
		String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		for (String rank: ranks){
			for(String suit: suits){
				deck.add(new Card(rank,suit));
			}
		}
						
	}
	
	void printDeck() {
		for(Card card : deck) {
			System.out.println(card);
			System.out.println("Deck shuffled.");
		}
	}
	
	public void shuffleDeck(){
		Collections.shuffle(deck);
	}
	
	// Print 1 randomcard from the deck
	public void printCard(){
		Collections.shuffle(deck);
		System.out.println("The cards is "+deck.get(1));
	}
	
	 // Method to check if two cards belong to the same suit
    public boolean sameCard(Card c1, Card c2) {
        return c1.getSuit().equals(c2.getSuit());
    }
	
	// Method to check if two cards have the same rank
    public boolean compareCard(Card c1, Card c2) {
        return c1.getRank().equals(c2.getRank());
    }
	
	// Method to find and print a specific card
    public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.getRank().equals(rank) && card.getSuit().equals(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found.");
    }
	
	// Method to deal 5 random cards
    public void dealCard() {
        Collections.shuffle(deck);
        System.out.println("Dealt 5 random cards:");
        for (int i = 0; i < 5; i++) {
            System.out.println(deck.get(i));
        }
    }
	
	

}