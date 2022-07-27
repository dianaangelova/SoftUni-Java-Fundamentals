package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double inputCoins;
        double sumReceived = 0;

        while (!input.equals("Start")) {
            inputCoins = Double.parseDouble(String.valueOf(input));

            if (inputCoins == 0.1 || inputCoins == 0.2 || inputCoins == 0.5 || inputCoins == 1 || inputCoins == 2) {
                sumReceived += inputCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputCoins);
            }
            input = scanner.nextLine();
        }
        // System.out.printf("SumReceived: %f", sumReceived);
        Double sum = sumReceived;
        input = scanner.nextLine();

        while (!input.equals("End") && sum > 0) {
            if (input.equals("Nuts")) {
                if (sum >= 2.0) {
                    System.out.printf("Purchased %s%n", input);
                    sum -= 2.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Water")) {
                if (sum >= 0.7) {
                    System.out.printf("Purchased %s%n", input);
                    sum -= 0.7;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (sum >= 1.5) {
                    System.out.printf("Purchased %s%n", input);
                    sum -= 1.5;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Soda")) {
                if (sum >= 0.8) {
                    System.out.printf("Purchased %s%n", input);
                    sum -= 0.8;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (input.equals("Coke")) {
                if (sum >= 1.0) {
                    System.out.printf("Purchased %s%n", input);
                    sum -= 1.0;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);

    }
}
