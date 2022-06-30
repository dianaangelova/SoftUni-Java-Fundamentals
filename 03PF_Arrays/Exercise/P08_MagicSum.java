package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int inputSum = Integer.parseInt(scanner.nextLine());
        int currentSum;
        for (int i = 0; i < numbers.length; i++) {
            currentSum=0;
            for (int j = i+1; j < numbers.length; j++) {
                currentSum = numbers[i] + numbers[j];
                if (currentSum == inputSum) {
                    System.out.print(numbers[i] + " " + numbers[j]);
                    System.out.println();
                }
            }

        }


    }
}
