package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int length = input.length();
        int number = Integer.parseInt(input);
        int sum = 0;
        int result = 0;
        char symbol;
        int singleInt;
        int fact = 1;
        for (int i = length - 1; i >= 0; i--) {
            symbol = input.charAt(i);
            singleInt = Integer.parseInt(String.valueOf(symbol));
            for (int j = 1; j <= singleInt; j++) {
                fact = fact * j;
            }
            sum = sum + fact;
            fact = 1;

        }

        if (sum == number) {
            System.out.printf("yes");
        } else System.out.printf("no");
    }
}
