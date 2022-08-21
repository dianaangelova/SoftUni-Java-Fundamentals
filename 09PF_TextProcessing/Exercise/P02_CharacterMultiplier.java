package Exercise;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        String str1 = input[0];
        String str2 = input[1];

        Integer result = multiplyString(str1, str2);
        System.out.println(result);
    }

    private static Integer multiplyString(String str1, String str2) {
        int multipl = 0;
        int sum = 0;

        if (str1.length() >= str2.length()) {
            for (int i = 0; i < str2.length() ; i++) {
                Character charFirstStr = str1.charAt(i);
                Character charSecondStr = str2.charAt(i);
                multipl = charFirstStr * charSecondStr;
                sum += multipl;
               }
            for (int i = str2.length(); i < str1.length() ; i++) {
                Character charFirstStr = str1.charAt(i);
                sum +=str1.charAt(i);
            }

        } else if (str2.length() > str1.length()) {
            for (int i = 0; i < str1.length(); i++) {
                Character charFirstStr = str1.charAt(i);
                Character charSecondStr = str2.charAt(i);
                multipl = charFirstStr * charSecondStr;
                sum += multipl;
            }
            for (int i = str1.length(); i < str2.length() ; i++) {
                Character charFirstStr = str2.charAt(i);
                sum +=str2.charAt(i);
            }
        }
        return sum;
    }
}
