package Lab;

import java.util.Scanner;

public class P09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        int years;

        double days;
        double hours;
        double minutes;

        years = centuries * 100;
        days = years * 365.2422;
        hours = days * 24;
        minutes = hours * 60;

        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",
                centuries, years, days, hours, minutes);

    }
}
