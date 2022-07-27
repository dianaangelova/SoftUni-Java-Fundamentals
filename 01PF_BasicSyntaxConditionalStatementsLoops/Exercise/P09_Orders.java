package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Double price;
        Double finalPrice = 0.0;

        for (int i = 1; i <= n; i++) {
            Double priceCapsule = scanner.nextDouble();
            int days = scanner.nextInt();
            int capsuleCount = scanner.nextInt();
            price = capsuleCount * priceCapsule * days;
            finalPrice += price;
            System.out.printf("The price for the coffee is: $%.2f%n", price);
        }
        System.out.printf("Total: $%.2f", finalPrice);
    }
}
