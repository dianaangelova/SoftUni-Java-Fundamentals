package Lab;

import java.util.Random;
import java.util.Scanner;

public class P01_Randomize_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Random rdm = new Random();

        for (int pos1 = 0; pos1 < input.length; pos1++) {
            int pos2 = rdm.nextInt(input.length);
            String temp;
            temp = input[pos1];
            input[pos1]=input[pos2];
            input[pos2]=temp;

        }
        System.out.println(String.join(
                System.lineSeparator(), input));
    }
}
