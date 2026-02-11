import java.util.Scanner;

public class CardDistribution {

    // Method to initialize deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }

        return deck;
    }

    // Method to shuffle deck (Fisher-Yates)
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int)(Math.random() * (n - i));

            // Swap
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        int totalNeeded = players * cardsPerPlayer;

        if (totalNeeded > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];

        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }

        return playerCards;
    }

    // Method to print players and their cards
    public static void printPlayers(String[][] playerCards) {
        if (playerCards == null) return;

        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + " Cards:");
            System.out.println("-------------------------");
            for (int j = 0; j < playerCards[i].length; j++) {
                System.out.println(playerCards[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize deck
        String[] deck = initializeDeck();

        // Shuffle deck
        shuffleDeck(deck);

        // Input players and cards
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

        // Distribute cards
        String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);

        // Print result
        printPlayers(playerCards);

        sc.close();
    }
}
