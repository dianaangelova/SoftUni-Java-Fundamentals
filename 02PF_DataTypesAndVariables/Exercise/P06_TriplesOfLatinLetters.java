package Exercise;

import java.util.Scanner;

public class P06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char char1;
        char char2;
        char char3;

        for (int i = 97; i < 97 + n; ++i) {
            char1=(char)i;
            for (int j = 97; j < 97 + n; ++j) {
                char2=(char)j;
                for (int k = 97; k < 97 + n; ++k) {
                    char3=(char)k;
                    System.out.printf("%c%c%c%n", char1, char2, char3);
                }
            }

        }

    }
}
