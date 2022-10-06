public class Card {
    private String cardValue;
    public Card(){
        cardValue = "Unknown";
    }
    public Card(String cardValue){
        this.cardValue = cardValue;
    }


    public void setCardValue(String cardValue) {
        this.cardValue = cardValue;
    }
    public String getCardValue() {
        return cardValue;
    }
}
