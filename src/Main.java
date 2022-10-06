public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Deck deck = new Deck();
        deck.printDeck();
        System.out.println("\n\n\n");
        deck.shuffle();
        deck.printDeck();

    }
}