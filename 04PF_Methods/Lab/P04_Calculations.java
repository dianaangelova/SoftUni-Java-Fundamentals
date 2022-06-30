package Lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        calculate(scanner.nextLine(), Integer.parseInt(scanner.nextLine()), Integer.parseInt(scanner.nextLine()));
    }

    public static void calculate(String operation, int firstNumber, int secondNumber) {
        int result=0;
        if (operation.equals("add")) {
            result = firstNumber + secondNumber;
        } else if (operation.equals("multiply")) {
            result = firstNumber * secondNumber;
        }else if (operation.equals("subtract")) {
            result = firstNumber - secondNumber;
        }else if (operation.equals("divide")) {
            result = firstNumber / secondNumber;
        }
        System.out.println(result);

    }
}
