package Lab;

import java.util.Scanner;

public class P07_ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c1 = scanner.nextLine();
        String c2 = scanner.nextLine();
        String c3 = scanner.nextLine();

        String concat = c3 + " " +c2 + " "+ c1;
        System.out.println(concat);
    }
}
