package Lab;

import java.util.Scanner;

public class P04_ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]);
            System.out.print(" ");

        }
    }
}
