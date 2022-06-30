package Lab;

import java.util.Scanner;

public class P01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        displayNegative(input);
    }

    public static void displayNegative(int number) {
        //  int number;
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number>0){
            System.out.printf("The number %d is positive.", number);
        } else if (number==0){
            System.out.println("The number 0 is zero.");
        }

    }
}
