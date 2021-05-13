package P03_CardsWithPower;

public class Card {
    private CardRank rank;
    private CardSuits suit;
    private int power;

    public Card(CardRank rank, CardSuits suit) {
        this.rank = rank;
        this.suit = suit;
        calculatePower();
    }

    private void calculatePower() {
       this.power = rank.getPower() + suit.getPowerOfSuit();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", this.rank, this.suit, this.power);
    }
}
