package Lab;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String toRemove = scanner.nextLine();
        String word = scanner.nextLine();
        while(word.contains(toRemove)) {
            word = word.replace(toRemove, "");
        }
        System.out.println(word);

    }
}
