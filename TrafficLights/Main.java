package P04_TrafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputTrafficLights = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < inputTrafficLights.length; j++) {
                TrafficLight trafficLight = TrafficLight.valueOf(inputTrafficLights[j]);
                System.out.printf("%s ", trafficLight);
                inputTrafficLights[j] = trafficLight.toString();
            }
            System.out.println();
        }

     }
}
