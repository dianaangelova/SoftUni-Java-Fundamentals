package Exercise;

import java.util.Scanner;

public class P09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPalindrome = false;
        while (!input.equals("END")) {
            char[] charArray = input.toCharArray();
            char[] charArrayReversed = new char[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                charArrayReversed[charArray.length - 1 - i] = charArray[i];
            }
            for (int i = 0; i < charArray.length; i++) {
                if (charArray[i] == charArrayReversed[i]) {
                    isPalindrome = true;
                } else isPalindrome = false;
            }
            System.out.println(isPalindrome);
            input = scanner.nextLine();
        }
    }
}

