package Exercise;

import java.util.Scanner;

public class P02_CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i <= secondArray.length - 1; i++) {
            for (int j = 0; j <= firstArray.length - 1; j++) {
                if (secondArray[i].equals(firstArray[j])) {
                    System.out.print(secondArray[i]);
                    System.out.print(" ");
                }
            }
        }
    }
}
