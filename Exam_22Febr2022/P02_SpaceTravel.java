package Exam_22Febr2022;

import java.util.Scanner;

public class P02_SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String route = scanner.nextLine();
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammunition = Integer.parseInt(scanner.nextLine());

        String[] stringArr = route.split("\\|\\|");
        int fuelLeft = fuel;
        int ammonitLeft = ammunition;
        boolean isFailed = false;
        for (int i = 0; i < stringArr.length && isFailed==false; i++) {

            String[] innerCommand = stringArr[i].split(" ");
            String command = innerCommand[0];


            switch (command) {
                case "Travel":
                    int number = Integer.parseInt(innerCommand[1]);
                    if (fuelLeft >= number) {
                        System.out.printf("The spaceship travelled %d light-years.%n", number);
                        fuelLeft = fuelLeft - number;
                    } else {
                        System.out.println("Mission failed.");
                        isFailed = true;
                        break;
                    }
                    break;
                case "Enemy":
                    int numberEn = Integer.parseInt(innerCommand[1]);

                    if (ammonitLeft >= numberEn) {
                        System.out.printf("An enemy with %d armour is defeated.%n", numberEn);
                        ammonitLeft = ammonitLeft - numberEn;
                    } else {
                        if (fuelLeft / 2 >= numberEn) {
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", numberEn);
                            fuelLeft = fuelLeft - numberEn * 2;
                        } else {
                            System.out.println("Mission failed.");
                            isFailed = true;
                            break;
                        }
                    }
                    break;
                case "Repair":
                    int numberR = Integer.parseInt(innerCommand[1]);
                    fuelLeft = fuelLeft + numberR;
                    ammonitLeft = ammonitLeft + numberR * 2;
                    System.out.printf("Ammunitions added: %d.%n", numberR * 2);
                    System.out.printf("Fuel added: %d.%n", numberR);
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
                    break;
            }
        }

    }


}

