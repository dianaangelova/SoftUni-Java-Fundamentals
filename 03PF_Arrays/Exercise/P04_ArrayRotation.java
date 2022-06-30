package Exercise;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split(" ");
        int numberRot = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberRot; i++) {
            String firstElement = inputArray[0];
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j + 1];
            }
            inputArray[inputArray.length-1]=firstElement;
        }
        System.out.println(String.join(" ", inputArray));

    }
}
