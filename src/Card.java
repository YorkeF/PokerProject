public class Card {
    private String card;
    public Card(){
        card = "Unknown";
    }
    public Card(String cardValue){
        this.card = cardValue;
    }


    public void setCard(String cardValue) {
        this.card = cardValue;
    }
    public String getCardString() {
        return card;
    }
    public String getCardSuit() {
        String value = card.substring(card.length()-1);
        switch (value){
            case "S":
                return "Spades";
            case "H":
                return "Hearts";
            case "C":
                return "Clubs";
            case "D":
                return "Diamonds";
        }
        return value;
    }
    public String getCardValue(){
        String value = card.substring(0, card.length()-1);
        switch (value){
            case "A":
                return "Ace";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Four";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
            case "10":
                return "Ten";
            case "J":
                return "Jack";
            case "Q":
                return "Queen";
            case "K":
                return "King";
        }
        return value;
    }

    public int getCardInt(){
        String value = card.substring(0, card.length()-1);
        switch (value){
            case "A":
                return 14;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
        }
        return Integer.valueOf(value);
    }

}
