package HotelReservation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputData = scanner.nextLine().split("\\s+");

        double pricePerDay = Double.parseDouble(inputData[0]);
        int days = Integer.parseInt(inputData[1]);


        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, days,
                Season.valueOf(inputData[2].toUpperCase()), DiscountType.valueOf(inputData[3].toUpperCase()));

        System.out.printf("%.2f", priceCalculator.calculateMethod());
    }
}
