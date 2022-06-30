package Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_MathPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(Math.pow(number, power)));

    }

    private static double mathPower(double number, int power) {
        double result=1;
        result = Math.pow(number, power);
        return result;
    }
}
