package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        String text="";
        if (age >= 0 && age <= 2) {
            text = "baby";
        } else if (age >= 3 && age <= 13) {
            text = "child";
        } else if (age >= 14 && age <= 19) {
            text = "teenager";
        } else if (age >= 20 && age <= 65) {
            text = "adult";
        } else if (age >= 66 ) {
            text = "elder";
        }
        System.out.printf("%s", text);
    }
}
