# Deck-Java-Lab
 Write a menu-driven Java Program for the following: There are 52 cards in a deck, each of which belongs to one of four suits and one of 13 ranks. Should have methods:  a) createDeck() //Can also add this  method as constructor  b) printDeck()  c) printCard()  d) sameCard() //Card which is from same suit  e) compareCard() //Card having same rank or number  f) findCard() //Search for particular card  g) dealCard() //Print 5 random cards  h) shuffleDeck() //Randomize the deck

# Menu-Driven Deck of Cards Program

## Overview
Welcome to the **Menu-Driven Deck of Cards Program!** This Java-based interactive program allows you to explore and manipulate a standard deck of 52 playing cards using a simple menu-driven interface.

## Features
- **Create a full deck** of 52 cards
- **Print the deck** to see all available cards
- **Print a specific card** by entering its index
- **Find a card** based on its rank and suit
- **Check if two cards belong to the same suit**
- **Compare two cards** to see if they share the same rank
- **Shuffle the deck** for a randomized order
- **Deal 5 random cards** as if you were playing a game!

## How It Works
Once you run the program, you’ll be greeted with a menu like this:
```
1. Print Deck
2. Print a Card
3. Find a Card
4. Shuffle Deck
5. Deal 5 Random Cards
6. Exit
```
Just enter the corresponding number, and the program will perform the requested action!

## Method Breakdown
Here’s a closer look at what each method does:

### `createDeck()`
- Initializes a deck with 52 cards, each having a rank (2–10, J, Q, K, A) and a suit (Spades, Hearts, Diamonds, Clubs).

### `printDeck()`
- Displays all 52 cards in the deck in order.

### `printCard(int index)`
- Prints the card at the specified index (0-51). If the index is invalid, it notifies the user.

### `findCard(String rank, String suit)`
- Searches for a card with the given rank and suit. If found, it prints the card; otherwise, it informs the user.

### `sameCard(Card c1, Card c2)`
- Checks if two given cards belong to the same suit and returns `true` or `false`.

### `compareCard(Card c1, Card c2)`
- Checks if two given cards have the same rank and returns `true` or `false`.

### `shuffleDeck()`
- Randomizes the order of the cards in the deck.

### `dealCard()`
- Selects and prints 5 random cards from the deck, simulating a real card deal.

