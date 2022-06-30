package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class P10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        returnsTopNumber(number);
    }

    private static void returnsTopNumber(int number) {

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            boolean hasOdd = false;
            boolean valid8 = false;
            int currentNumber = i;
            sum = 0;
            while (currentNumber > 0) {
                int lastDigit = currentNumber % 10;
                currentNumber = currentNumber / 10;
                sum += lastDigit;
                if (lastDigit % 2 != 0 && hasOdd ==false) {
                    hasOdd = true;
                }
            }
            if (sum % 8 == 0) {
                valid8 = true;
            }
            if (hasOdd && valid8) {
                System.out.println(i);
            }
        }
    }
}

