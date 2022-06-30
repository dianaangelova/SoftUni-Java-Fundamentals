package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i]%2==0){
                sumEven+=array[i];
            } else sumOdd+=array[i];
        }
        System.out.println(sumEven-sumOdd);
    }
}
