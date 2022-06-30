package Lab;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class P10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer integerInput = Math.abs(Integer.parseInt(input));

        String stringInput = "";
        stringInput = String.valueOf(integerInput);

        char[] chArray = new char[stringInput.length()];

        for (int i = 0; i < stringInput.length(); i++) {
            chArray[i] = stringInput.charAt(i);
        }
        int [] integerArray = new int[chArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i]= Character.getNumericValue(chArray[i]);
        }

        //System.out.println(integerArray);
         getMuliplyEvenOdd(integerArray);
    }

    private static void getMuliplyEvenOdd(int[] integerArray) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                sumEven += integerArray[i];
            } else {
                sumOdd += integerArray[i];
            }
        }
        int multiply = sumEven * sumOdd;
        System.out.println(multiply);
    }
}
