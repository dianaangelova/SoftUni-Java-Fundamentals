package Lab;

import java.util.Scanner;

public class P12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int digit = 0;
        boolean isEqual = false;
        for (int i = 1; i <= number; i++) {
            digit = i;
            while (i > 0) {
                sum += i % 10;
                i = i / 10;
            }
            isEqual = (sum == 5) || (sum == 7) || (sum == 11);
            if (isEqual == true) {
                System.out.printf("%d -> True%n", digit);
            } else System.out.printf("%d -> False%n", digit);


        sum = 0;
        i = digit;

    }


}
}
