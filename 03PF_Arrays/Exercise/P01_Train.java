package Exercise;

import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int sumAll = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(numbers[i]);
            System.out.print(" ");
            sumAll += numbers[i];
        }
        System.out.printf("%n%d",sumAll);

    }
}
