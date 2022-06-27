package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            sum+=i;
            System.out.printf("%d ", i);
        }
        System.out.printf("%nSum: %d", sum);
    }
}
