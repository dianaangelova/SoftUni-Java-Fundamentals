package Lab;

import java.util.Scanner;

public class P11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        double result = calculate(firstNum, operator, secondNum);
        System.out.printf("%.0f", result);

    }

    public static double calculate(int firstNum, String operator, int secondNum) {
        double result = 0.0;
// / * + -
        switch (operator) {
            case "/":
                result = firstNum / secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;

        }


        return result;
    }
}
