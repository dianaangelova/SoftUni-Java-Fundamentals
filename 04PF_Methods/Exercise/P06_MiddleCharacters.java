package Exercise;

import java.util.Scanner;

public class P06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        getMiddleChars(input);
    }

    private static void getMiddleChars(String input) {
        if (input.length() % 2 == 0) {
            char char1 = input.charAt(input.length() / 2 - 1);
            char char2 = input.charAt(input.length() / 2);
            System.out.print(char1);
            System.out.print(char2);
        } else {
            char char1 = input.charAt(input.length() / 2 );
            System.out.println(char1);
        }
    }
}
