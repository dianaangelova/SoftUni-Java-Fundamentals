package Exercise;

import java.util.Scanner;

public class P05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = SumMethod(number1, number2);
        int substr = SubstMethod(sum, number3);
        System.out.println(substr);
    }

    private static int SubstMethod(int sum, int number3) {
        int substr = sum - number3;
        return substr;
    }

    private static int SumMethod(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
}
