package P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardColor = scanner.nextLine();

        Card card = new Card(CardRank.valueOf(cardRank), CardSuits.valueOf(cardColor));

        System.out.println(card.toString());
    }
}


