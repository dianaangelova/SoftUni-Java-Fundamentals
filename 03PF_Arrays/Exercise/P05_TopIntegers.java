package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<Integer> numbersMax = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = i + 1; j <= numbers.length - 1; j++) {
                while (numbers[i] < numbers[j] && numbers[j] > max) {

                    max = numbers[j];

                }
                while (numbers[i] > numbers[j] && numbers[i] > max) {
                    max = numbers[i];
                }
                while (numbers[i] == numbers[j]) {
                    break;
                }
            }

            if (numbers[i] >= max && !numbersMax.contains(numbers[i])) {
                numbersMax.add(numbers[i]);
            }
            max = Integer.MIN_VALUE;
        }

        for (int i = 0; i < numbersMax.size(); i++) {
            System.out.print(numbersMax.get(i) + " ");
        }

    }

}
