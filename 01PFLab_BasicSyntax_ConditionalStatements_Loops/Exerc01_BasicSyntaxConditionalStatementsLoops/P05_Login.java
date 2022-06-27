package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        //String username = text;
        int length = username.length();
        char symbol;
        String password = "";
        int tries=0;

        for (int i = length - 1; i >= 0; i--) {
            symbol = username.charAt(i);
            //System.out.printf("%c",symbol);
            password += symbol;
        }
        //System.out.printf("Password: %s",password);


        for (tries = 0; tries <= 3; tries++) {
            String text = scanner.nextLine();
            if (text.equals(password)) {
                System.out.printf("User %s logged in.", username);
                tries=0;
                break;
            } else if (!text.equals(password) && tries<3) {
                System.out.printf("Incorrect password. Try again.%n");
                //text = scanner.nextLine();
            }


        }

        if (tries == 4) {
            System.out.printf("User %s blocked!", username);
        }

    }
}
