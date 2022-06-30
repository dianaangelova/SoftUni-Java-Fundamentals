package Exercise;

import java.util.Scanner;

public class P03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        char character1 = input1.charAt(0);
        char character2 = input2.charAt(0);

        getCharsBetween(character1, character2);

    }

    private static void getCharsBetween(char character1, char character2) {
        if (character1 < character2) {
            for (int i = character1 + 1; i < character2; i++) {
                System.out.print((char) i + " ");
            }
        } else{
            for (int i = character2 + 1; i < character1; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
