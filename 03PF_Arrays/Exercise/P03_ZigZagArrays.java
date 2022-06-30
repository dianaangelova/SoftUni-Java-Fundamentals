package Exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.join;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 1; i <= n; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (i % 2 != 0) { // нечетна итерация, първи ред
                firstArray[i - 1] = line[0];
                secondArray[i - 1] = line[1];
            } else if (i % 2 == 0) {
                firstArray[i - 1] = line[1];
                secondArray[i - 1] = line[0];
            }

        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
