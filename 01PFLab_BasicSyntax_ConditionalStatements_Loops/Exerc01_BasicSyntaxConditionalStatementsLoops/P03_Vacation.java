package Exerc01_BasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();
        double singlePrice = 0;
        double totalPrice = 0;
        double reducedPrice = 0;


        if (group.equals("Students")) {
            if (day.equals("Friday"))
                singlePrice = 8.45;
            else if (day.equals("Saturday"))
                singlePrice = 9.80;
            else if (day.equals("Sunday"))
                singlePrice = 10.46;

        } else if (group.equals("Business")) {
            if (day.equals("Friday"))
                singlePrice = 10.90;
            else if (day.equals("Saturday"))
                singlePrice = 15.60;
            else if (day.equals("Sunday"))
                singlePrice = 16;

        } else if (group.equals("Regular")) {
            if (day.equals("Friday"))
                singlePrice = 15;
            else if (day.equals("Saturday"))
                singlePrice = 20;
            else if (day.equals("Sunday"))
                singlePrice = 22.50;
        }

        totalPrice = singlePrice * number;

        if (group.equals("Students") && number >= 30) {
            reducedPrice = totalPrice - totalPrice * 15 / 100;
        }

        if (group.equals("Business") && number >= 100) {
            reducedPrice = (number - 10) * singlePrice;
        }

        if (group.equals("Regular") && number >= 10 && number <=20) {
            reducedPrice = totalPrice - totalPrice * 5 / 100;
        }

        if (reducedPrice>0){
            System.out.printf("Total price: %.2f", reducedPrice);
        } else System.out.printf("Total price: %.2f", totalPrice);
    }
}
