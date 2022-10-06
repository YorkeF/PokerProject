public class Hand {
    private int size;
    private Card[] hand;

    public Hand(){
        size = 5;
        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
        }
    }
    public Hand(Card card1, Card card2, Card card3, Card card4, Card card5){
        hand = new Card[]{card1, card2, card3, card4, card5};
    }
    public Hand(int size){
        this.size = size;
        hand = new Card[this.size];
    }

    public Card[] getHand() {
        return hand;
    }
    public void setHand(Card[] hand) {
        this.hand = hand;
    }

    public int value(Hand hand){
        int value = 0;




        return value;
    }


}
