package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int div = 0;

        if (number % 10 == 0) {
            div = 10;
        } else if (number % 7 == 0) {
            div = 7;
        } else if (number % 6 == 0) {
            div = 6;
        } else if (number % 3 == 0) {
            div = 3;
        } else if (number % 2 == 0) {
            div = 2;
        } else {
            System.out.println("Not divisible");
        }

        if (div!=0) {
            System.out.printf("The number is divisible by %d", div);
        }
    }
}
