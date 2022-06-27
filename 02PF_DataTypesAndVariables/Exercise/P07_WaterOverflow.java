package Exercise;

import java.util.Scanner;

public class P07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int quantity;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            quantity = Integer.parseInt(scanner.nextLine());
            sum += quantity;

            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum-=quantity;
            }
        }
        System.out.println(sum);
    }
}
