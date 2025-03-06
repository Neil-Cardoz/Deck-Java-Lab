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
	



}