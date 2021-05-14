package p04_FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Buyer> buyers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens.length == 4) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String id = tokens[2];
                String birthDate = tokens[3];
                buyers.add(new Citizen(name, age, id, birthDate));
            } else if (tokens.length == 3) {
                String name = tokens[0];
                int age = Integer.parseInt(tokens[1]);
                String group = tokens[2];
                buyers.add(new Rebel(name, age, group));
            }
        }
        int food = 0;
        String name = scanner.nextLine();
        while (!name.equals("End")) {

            for (Buyer buyer : buyers) {
                if(name.equals(buyer.getName())) {
                    buyer.buyFood();
                    food += buyer.getFood();
                }
            }
            name = scanner.nextLine();
        }
        System.out.println(food);
    }
}
