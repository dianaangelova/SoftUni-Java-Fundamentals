package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for (int i = 0; i <= firstArray.length - 1; i++) {
            if (firstArray[i] == secondArray[i]) {
            sum +=firstArray[i];
            } else {
                sum=0;
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                break;
            }
        }

        if (sum!=0){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
