package Exercise;

import java.util.Scanner;

public class P02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        countVowels(input);
    }

    public static void countVowels(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            if (c.equals("a") || c.equals("e") || c.equals("u") || c.equals("o") || c.equals("i") ||
                    c.equals("A") || c.equals("E") || c.equals("U") || c.equals("O") || c.equals("I")) {
                sum += +1;
            }
            ;
        }
        System.out.println(sum);
    }
}
