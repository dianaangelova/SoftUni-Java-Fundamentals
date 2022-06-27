package Lab;

import java.util.Scanner;

public class P06_CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String c1 = scanner.nextLine();
        String c2 = scanner.nextLine();
        String c3 = scanner.nextLine();

        String concat = c1 + c2 + c3;
        System.out.println(concat);

    }
}
