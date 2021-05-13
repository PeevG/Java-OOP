import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int start = 1; start <= size; start++) {
            printRow(size, start);
        }
        for (int start = size - 1; start >= 1; start--) {
            printRow(size, start);
        }
    }

    private static void printRow(int size, int start) {
        for (int j = 0; j < size - start; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k < start; k++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
