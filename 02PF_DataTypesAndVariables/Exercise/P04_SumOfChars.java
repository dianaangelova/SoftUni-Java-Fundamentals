package Exercise;

import java.util.Scanner;

public class P04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char c;
        int sum=0;
        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            c= s.charAt(0);
            sum+=c;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
