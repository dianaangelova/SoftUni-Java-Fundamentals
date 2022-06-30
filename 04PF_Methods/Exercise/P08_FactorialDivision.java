package Exercise;

import java.util.Scanner;

public class P08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = Integer.parseInt(scanner.nextLine());
        long second = Integer.parseInt(scanner.nextLine());
        double rezult = factorial(first)*1.0 / factorial(second);

        System.out.printf("%.2f", rezult);
    }

    private static long factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}