package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int countMax = 0;
        int currentNumber = 0;
        int numberMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            count = 0;
            currentNumber = 0;
            for (int j = i; j < numbers.length - 1; j++) {
                if (numbers[i] == numbers[j + 1]) {
                    count++;
                    currentNumber = numbers[i];
                } else break;
            }
            if (count > 0 && count > countMax) {
                countMax = count;
                numberMax = currentNumber;
            }

        }
        for (int i = 0; i <= countMax; i++) {
            System.out.print(numberMax);
            System.out.print(" ");
        }

    }
}
