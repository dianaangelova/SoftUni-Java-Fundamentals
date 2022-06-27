package Exercise;

import java.util.Scanner;

public class P05_PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startN = Integer.parseInt(scanner.nextLine());
        int endN = Integer.parseInt(scanner.nextLine());

        for (int i = startN; i <= endN; i++) {
            char c = (char) i;
            System.out.printf("%c ", c);
        }

    }
}
