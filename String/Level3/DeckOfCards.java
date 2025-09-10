package String.Level3;
import java.util.*;

public class DeckOfCards {

    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
                              "Jack", "Queen", "King", "Ace"};

    // Initialize Deck
    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle Deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
    }

    // Distribute Cards
    public static String[][] distribute(String[] deck, int players, int cardsEach) {
        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return new String[0][0];
        }

        String[][] result = new String[players][cardsEach];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards each: ");
        int cardsEach = sc.nextInt();

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        String[][] distributed = distribute(deck, players, cardsEach);
        for (int i = 0; i < distributed.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + Arrays.toString(distributed[i]));
        }
    }
}
