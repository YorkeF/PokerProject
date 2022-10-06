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
    public Card getCard(int pos){
        return hand[pos];
    }





    public boolean hasRoyalFlush(Hand hand){
        if (hasRoyalFlush(hand)){

        }
        return false;
    }
    public boolean hasStraightFlush(Hand hand){
        if (hasStraight(hand) && hasFlush(hand)){
            return true;
        }
        return false;
    }
    public boolean hasFourOfAKind(Hand hand){
        for (int i = 0; i < hand.size; i++) {
            for (int j = 0; j < hand.size; j++) {
                for (int k = 0; k < hand.size; k++) {
                    for (int l = 0; l < hand.size; l++) {
                        if ((hand.getCard(i).getCardInt() == hand.getCard(j).getCardInt() && hand.getCard(i).getCardInt() == hand.getCard(k).getCardInt() && hand.getCard(i).getCardInt() == hand.getCard(l).getCardInt()) && ((i != l) && (i != j) && (i != k))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public boolean hasFullHouse(Hand hand){
        if (hasFullHouse(hand)){

        }
        return false;
    }
    public boolean hasFlush(Hand hand){
        if ((hand.getCard(0).getCardSuit() == "D") && (hand.getCard(1).getCardSuit() == "D") && (hand.getCard(2).getCardSuit() == "D") && (hand.getCard(3).getCardSuit() == "D") && (hand.getCard(4).getCardSuit() == "D")){
            return true;
        }
        if ((hand.getCard(0).getCardSuit() == "S") && (hand.getCard(1).getCardSuit() == "S") && (hand.getCard(2).getCardSuit() == "S") && (hand.getCard(3).getCardSuit() == "S") && (hand.getCard(4).getCardSuit() == "S")){
            return true;
        }
        if ((hand.getCard(0).getCardSuit() == "C") && (hand.getCard(1).getCardSuit() == "C") && (hand.getCard(2).getCardSuit() == "C") && (hand.getCard(3).getCardSuit() == "C") && (hand.getCard(4).getCardSuit() == "C")){
            return true;
        }
        if ((hand.getCard(0).getCardSuit() == "H") && (hand.getCard(1).getCardSuit() == "H") && (hand.getCard(2).getCardSuit() == "H") && (hand.getCard(3).getCardSuit() == "H") && (hand.getCard(4).getCardSuit() == "H")){
            return true;
        }
        return false;
    }
    public boolean hasStraight(Hand hand){
        if(hasStraight(hand)){

        }
        return false;
    }
    public boolean hasThreeOfAKind(Hand hand){
        for (int i = 0; i < hand.size; i++) {
            for (int j = 0; j < hand.size; j++) {
                for (int k = 0; k < hand.size; k++) {
                    if((hand.getCard(i).getCardInt() == hand.getCard(j).getCardInt() && hand.getCard(i).getCardInt() == hand.getCard(k).getCardInt()) && ((i != j) && (i != k))){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean hasTwoPair(Hand hand){
        //returns true if hand has two pairs of cards with the same value
        int count = 0;
        for (int i = 0; i < hand.size; i++) {
            for (int j = 0; j < hand.size; j++) {
                if (hand.getCard(i).getCardInt() == hand.getCard(j).getCardInt() && i != j){
                    count++;
                }
            }
        }
        if (count == 4){
            return true;
        }
        return false;

    }
    public boolean hasOnePair(Hand hand){
        for (int i = 0; i < hand.size; i++) {
            for (int j = 0; j < hand.size; j++) {
                if ((hand.getCard(i).getCardInt() == hand.getCard(j).getCardInt()) && i != j){
                    return true;
                }
            }
        }
        return false;
    }
    public int highCardValue(Hand hand){
        int highestcard = 0;
        int highestvalue = 0;
        for (int i = 0; i < hand.size; i++) {
            if (hand.getCard(i).getCardInt() > highestvalue){
                highestcard = i;
                highestvalue = hand.getCard(i).getCardInt();
            }
        }
        return highestvalue;
    }






    public int handValue(Hand hand){
        int value = 0;




        return value;
    }


}
