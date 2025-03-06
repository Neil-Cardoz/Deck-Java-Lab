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
	
	


}