package Exercise;

import java.util.Scanner;

public class P02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int digit;
        int sum =0;
        while (n!=0){
            digit = n%10;
            sum+=digit;
            n=n/10;
        }
        System.out.println(sum);

    }
}
