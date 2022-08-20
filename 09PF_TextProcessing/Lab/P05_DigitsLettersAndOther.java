package Lab;

import java.util.Scanner;

public class P05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String digits = "";
        String letters = "";
        String symbols = "";
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (Character.isDigit(character)) {
                digits = digits + character;
            } else if (Character.isAlphabetic(character)) {
                letters = letters + character;
            } else {
                symbols = symbols + character;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);

    }
}
