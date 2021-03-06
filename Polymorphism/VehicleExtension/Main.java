package p02_VehicleExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");
        String[] busInfo = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        double carFuelQuantity = Double.parseDouble(carInfo[1]);
        double litersPerKm = Double.parseDouble(carInfo[2]);
        double tankCapacity = Double.parseDouble(carInfo[3]);

        Car car = new Car(carFuelQuantity, litersPerKm, tankCapacity);
        Truck truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3]));
        Bus bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];
            double distance = Double.parseDouble(tokens[2]);
            try {
                switch (command) {
                    case "Drive":
                        if (tokens[1].equals("Car")) {
                            System.out.println(car.drive(distance));
                        } else if (tokens[1].equals("Truck")) {
                            System.out.println(truck.drive(distance));
                        } else {
                            System.out.println(bus.drive(distance));
                        }
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(tokens[2]);
                        if (tokens[1].equals("Car")) {
                            car.refuel(liters);
                        } else if (tokens[1].equals("Truck")) {
                            truck.refuel(liters);
                        } else {
                            bus.refuel(liters);
                        }
                        break;
                    case "DriveEmpty":
                        System.out.println(bus.drive(Double.parseDouble(tokens[2])));
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(car.toString());
        System.out.println(truck.toString());
        System.out.println(bus.toString());
    }
}
