import java.util.Random;

public class Deck {
    private int size;
    private Card[] deck;
    Random rand = new Random();

    public Deck(){
        this.size = 52;
        deck = new Card[]{
                new Card("AH"), new Card("AS"), new Card("AD"), new Card("AC"),
                new Card("2H"), new Card("2S"), new Card("2D"), new Card("2C"),
                new Card("3H"), new Card("3S"), new Card("3D"), new Card("3C"),
                new Card("4H"), new Card("4S"), new Card("4D"), new Card("4C"),
                new Card("5H"), new Card("5S"), new Card("5D"), new Card("5C"),
                new Card("6H"), new Card("6S"), new Card("6D"), new Card("6C"),
                new Card("7H"), new Card("7S"), new Card("7D"), new Card("7C"),
                new Card("8H"), new Card("8S"), new Card("8D"), new Card("8C"),
                new Card("9H"), new Card("9S"), new Card("9D"), new Card("9C"),
                new Card("10H"), new Card("10S"), new Card("10D"), new Card("10C"),
                new Card("JH"), new Card("JS"), new Card("JD"), new Card("JC"),
                new Card("QH"), new Card("QS"), new Card("QD"), new Card("QC"),
                new Card("KH"), new Card("KS"), new Card("KD"), new Card("KC"),
        };
    }


    public Card[] getDeck() {
        return deck;
    }
    public void setDeck(Card[] deck) {
        this.deck = deck;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }




    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }
    private void swapAt(int i, int j){
        Card temp = deck[i];
        deck[i] = deck[j];
        deck[j] = temp;
    }
    public void shuffle(){
        for (int i = 0; i < deck.length; i++) {
            swapAt(i, randRange(i, deck.length));
        }
    }



    public void printDeck(){
        for (int i = 0; i < deck.length; i++) {
            System.out.println("Card " + (i + 1) + ": " + deck[i].getCardValue() + " of " + deck[i].getCardSuit());
        }
    }



    public Card drawCard(){
        return deck[0];
    }
    public Hand drawHand(){
        return new Hand(deck[0], deck[1], deck[2], deck[3], deck[4]);
    }

}
