package P03_CardsWithPower;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int powerOfSuit;

    CardSuits(int powerOfSuit) {
        this.powerOfSuit = powerOfSuit;
    }

    public int getPowerOfSuit() {
        return this.powerOfSuit;
    }
}
