package Lab;

import java.util.Scanner;

public class P03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        createTriangle(number);
    }


    public static void createTriangle(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = number-1; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    }

