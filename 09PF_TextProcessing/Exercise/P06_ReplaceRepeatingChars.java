package Exercise;

import java.util.Scanner;

public class P06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length() - 1; i++) {
            Character character = input.charAt(i);
            if (input.charAt(i) == input.charAt(i + 1)) {
                String replace = Character.toString(character)+Character.toString(character);
                input = input.replaceAll(replace, String.valueOf(character));
                i=-1;
            }
        }
        System.out.println(input);
    }
}
