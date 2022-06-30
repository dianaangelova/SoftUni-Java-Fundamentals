package Exercise;

import java.util.Scanner;

public class P04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        validatePassword(password);
    }

    private static void validatePassword(String password) {

        boolean isValidLength;
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValidLength = false;
        } else isValidLength = true;
        boolean isDigitLetter = false;
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);

            if (!Character.isDigit(character) && !Character.isAlphabetic(character)) {
                isDigitLetter = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            } else isDigitLetter = true;

            if (Character.isDigit(character)) {
                countDigits++;
            }

        }
        if (countDigits < 2) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidLength && isDigitLetter && countDigits >= 2) {
            System.out.println("Password is valid");
        }

    }
}
