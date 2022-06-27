package Lab;

import java.util.Scanner;

public class P10_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int digit = 0;
        int number=0;
        int sumdigits = 0;
        for (int i = 1; i <= inputNumber; i++) {
            System.out.print(i);
            number=i;
            sumdigits=0;
            while (number != 0) {
                digit = number % 10;
                number /= 10;
                sumdigits += digit;
            }
            if (sumdigits == 5 || sumdigits == 7 || sumdigits == 11) {
                System.out.println(" -> True");
            } else {
                System.out.println(" -> False");
            }
        }
    }
}
