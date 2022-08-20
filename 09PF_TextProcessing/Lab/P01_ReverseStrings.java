package Lab;

import java.util.Scanner;

public class P01_ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String newString = "";

        while (!input.equals("end")) {
            for (int i = input.length()-1; i >= 0; i--) {
                Character character = input.charAt(i);
                newString = newString + character;
            }
            System.out.println(input + " = " + newString);
            input = scanner.nextLine();
            newString = "";
        }
    }
}
