package Lab01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P11_MultiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int multipl = Integer.parseInt(scanner.nextLine());
        if (multipl <= 10) {
           for (int i = multipl; i <= 10; i++) {
                int product = number * i;
                System.out.printf("%d X %d = %d%n", number, i, product);
            }
        } else if (multipl>10){
            System.out.printf("%d X %d = %d%n", number, multipl, number*multipl);

        }
    }
}
