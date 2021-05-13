package P01_CardSuit;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CardSuits[] cardSuits = CardSuits.values();

        System.out.println("Card Suits:");
        for (CardSuits card : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }
    }
}
