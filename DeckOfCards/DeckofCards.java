package Day11_oops.DeckOfCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckofCards {
    public static void main(String[] args) {
        List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

        ArrayList<String> deck = new ArrayList<>();

        // Initialize deck of cards
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck of cards
        Collections.shuffle(deck);

        // Distribute 9 cards to 4 players using a 2D array
        String[][] players = new String[4][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                players[j][i] = deck.remove(0);
            }
        }

        // Print cards received by each player using a 2D array
        for (int i = 0; i < 4; i++) {
            System.out.println("Cards received by Player " + (i + 1) + ":");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
