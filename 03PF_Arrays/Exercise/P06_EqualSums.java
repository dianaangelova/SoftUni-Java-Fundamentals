package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumLeft = 0;
        int sumRight = 0;
boolean isEqual=false;

        for (int i = 0; i <= numbers.length - 1; i++) {
            for (int j = 0; j < i; j++) {
                sumLeft += numbers[j];
            }
            for (int k = i+1; k <= numbers.length - 1; k++) {
                sumRight += numbers[k];
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                isEqual=true;
            }
            sumLeft = 0;
            sumRight = 0;
        }

        if (isEqual==false){
            System.out.println("no");
        }
    }
}
