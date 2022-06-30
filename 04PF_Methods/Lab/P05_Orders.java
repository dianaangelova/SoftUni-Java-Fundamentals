package Lab;

import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculateOrder(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    private static void calculateOrder(String product, double quantity) {
        double totalAmount = 0;
        switch (product) {
            case "coffee":
                totalAmount = quantity * 1.50;
                break;
            case "water":
                totalAmount = quantity * 1.00;
                break;
            case "coke":
                totalAmount = quantity * 1.40;
                break;
            case "snacks":
                totalAmount = quantity * 2.00;
                break;


        }
        System.out.printf( "%.2f",totalAmount);
    }

}
