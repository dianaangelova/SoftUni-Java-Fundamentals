package Lab01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P08_DivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 100; i+=3) {

            System.out.printf("%d%n",i);
        }
    }
}
