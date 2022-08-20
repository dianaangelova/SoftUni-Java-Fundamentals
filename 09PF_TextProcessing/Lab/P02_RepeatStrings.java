package Lab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        StringBuilder result= new StringBuilder();

        for (String word: wordsArr) {
            int count= word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        String s= result.toString();
        System.out.println(s);
    }
}
