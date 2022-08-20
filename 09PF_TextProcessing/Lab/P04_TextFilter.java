package Lab;

import java.util.Scanner;

public class P04_TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] toRemoveArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (String toRemove : toRemoveArr) {
            int count = toRemove.length();
            String asterisk = "";
            for (int i = 0; i < count; i++) {
                asterisk = asterisk + "*";
            }
            text = text.replace(toRemove, asterisk);
        }
        System.out.println(text);
    }
}
