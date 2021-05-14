package p03_BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            switch (tokens[0]) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthdate = tokens[4];
                    birthableList.add(new Citizen(name, age, id, birthdate));
                    break;
                case "Robot":
                    String model = tokens[1];
                    id = tokens[2];
                    // to add robs ?
                    break;
                case "Pet":
                    name = tokens[1];
                    birthdate = tokens[2];
                    birthableList.add(new Pet(name, birthdate));
                    break;
            }
            input = scanner.nextLine();
        }
        String year = scanner.nextLine();
        for (Birthable birthable : birthableList) {
            if(birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable);
            }
        }
    }
}
