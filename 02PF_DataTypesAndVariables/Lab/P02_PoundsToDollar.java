package Lab;

import java.util.Scanner;

public class P02_PoundsToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound = Double.parseDouble(scanner.nextLine());

        Double usd = pound * 1.36;

        System.out.printf("%.3f", usd);

    }
}
