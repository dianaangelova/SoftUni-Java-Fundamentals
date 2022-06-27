package Lab01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P04_BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minute = Integer.parseInt(scanner.nextLine());

        if (minute < 30) {
            minute += 30;
        } else {
            hour++;
            minute -= 30;
        }

        if (hour==24) {
            hour=00;
        }

        System.out.printf("%d:%02d", hour, minute);
    }
}
