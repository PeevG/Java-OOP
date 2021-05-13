package P05_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = matrixSize[0];
        int m = matrixSize[1];

        int[][] matrix = new int[n][m];

        int value = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] ivoStartPoints = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilStartPoints = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilStartRow = evilStartPoints[0];
            int evilStartCol = evilStartPoints[1];

            while (evilStartRow >= 0 && evilStartCol >= 0) {
                if (evilStartRow >= 0 && evilStartRow < matrix.length && evilStartCol >= 0 && evilStartCol < matrix[0].length) {
                    matrix[evilStartRow][evilStartCol] = 0;
                }
                evilStartRow--;
                evilStartCol--;
            }

            int ivoStartRow = ivoStartPoints[0];
            int ivoStartCol = ivoStartPoints[1];

            while (ivoStartRow >= 0 && ivoStartCol < matrix[1].length) {
                if (ivoStartRow >= 0 && ivoStartRow < matrix.length && ivoStartCol >= 0 && ivoStartCol < matrix[0].length) {
                    sum += matrix[ivoStartRow][ivoStartCol];
                }

                ivoStartCol++;
                ivoStartRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }
}
