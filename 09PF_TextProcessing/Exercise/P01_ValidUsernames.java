package Exercise;

import java.util.Scanner;

public class P01_ValidUsernames {

    public static boolean isValid(String word) {
        int count = word.length();
        boolean isCorrect = false;
        if (count >= 3 && count <= 16) {
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (Character.isDigit(character)
                        || Character.isAlphabetic(character)
                        || character == '-'
                        || character == '_') {
                    isCorrect = true;
                } else {
                    isCorrect = false;
                    break;
                }
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernamesArr = scanner.nextLine().split(", ");

        for (String word : usernamesArr) {
            if (isValid(word)) {
                System.out.println(word);
            }
        }


    }
}
