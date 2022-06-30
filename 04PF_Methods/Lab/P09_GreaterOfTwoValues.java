package Lab;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String inputA = scanner.nextLine();
        String inputB = scanner.nextLine();

        getMax(type, inputA, inputB);
    }

    private static void getMax(String type, String inputA, String inputB) {
        boolean isInt = false;
        boolean isString = false;
        String resultStr = "";
        int result = 0;
        switch (type) {
            case "int":
                int numberA = Integer.parseInt(inputA);
                int numberB = Integer.parseInt(inputB);
                if (numberA > numberB) {
                    result = numberA;
                } else result = numberB;
                isInt = true;
                break;
            case "char":
            case "string":
                if (inputA.compareTo(inputB) > 0) {
                    resultStr = inputA;
                } else resultStr = inputB;
                isString = true;
                break;
        }
         if (isInt == true) {
            System.out.println(result);
            ;
        } else {
            System.out.println(resultStr);
        }
        ;


    }
}
