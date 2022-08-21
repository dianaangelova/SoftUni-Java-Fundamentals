package Exercise;

import java.util.Scanner;

public class P04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result="";

        for (int i = 0; i < input.length(); i++) {
            Character character= input.charAt(i);
            int characterPositShift=character+3;
            Character characterShift=(char)(characterPositShift);
            result+=characterShift;
        }
        System.out.println(result);
    }
}
