package p03_WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        String line = "";

        while (!"End".equals(line = scanner.nextLine())) {
            String[] animalInfo = line.split("\\s+");
            String type = animalInfo[0];
            String name = animalInfo[1];
            double weight = Double.parseDouble(animalInfo[2]);
            String livingRegion = animalInfo[3];

            Animal animal = null;
            switch (type) {
                case "Mouse":
                    animal = new Mouse(name, type, weight,livingRegion);
                    break;
                case "Zebra":
                    animal = new Zebra(name, type, weight,livingRegion);
                    break;
                case "Cat":
                    animal = new Cat(name, type, weight, livingRegion, animalInfo[4]);
                    break;
                case "Tiger":
                    animal = new Tiger(name, type, weight,livingRegion);
                    break;
            }
            animal.makeSound();

            String[] foodInfo = scanner.nextLine().split("\\s+");
            Food food = null;
            int foodQuantity = Integer.parseInt(foodInfo[1]);
            if (foodInfo[0].equals("Vegetable")) {
                food = new Vegetable(foodQuantity);
            } else {
                food = new Meat(foodQuantity);
            }
            try {
                animal.eat(food);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            animals.add(animal);
        }
        animals.forEach(System.out::println);
    }
}
