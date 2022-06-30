package Lab;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String result = repeatString(input, count);

    }

    private static String repeatString(String input, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            System.out.print(input);
        }

        return result;
    }
}
