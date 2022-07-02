package Exam_22Febr2022;

import java.util.Scanner;

public class P01_BurgerBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCities = Integer.parseInt(scanner.nextLine());

        Double profitPerCity;
        Double totalProfit = 0.0;

        for (int i = 0; i < numberCities; i++) {
            profitPerCity = 0.0;
            String city = scanner.nextLine();
            Double earned = Double.parseDouble(scanner.nextLine());
            Double expenses = Double.parseDouble(scanner.nextLine());
            if ((i+1) % 3 == 0 && (i+1)!=15) {
                // earned - (spent + (spent/2) )
                profitPerCity = earned - (expenses + expenses / 2);
            } else if ((i+1) % 5 == 0 ) {
                profitPerCity = (earned - earned * 10 / 100) - expenses;
            } else {
                profitPerCity = earned - expenses;
            }
            totalProfit = totalProfit + profitPerCity;

            System.out.printf("In %s Burger Bus earned %.2f leva.%n", city, profitPerCity);

        }

        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);



    }
}
