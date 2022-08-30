package P03_ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_NeedForSpeedIII {

    static class Car {
        String carName;
        int mileage;
        int fuel;

        public Car(String carName, int mileage, int fuel) {
            this.carName = carName;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getCarName() {
            return carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String carsText = scanner.nextLine();
            List<String> carsInputList = Arrays.stream(carsText.split("\\|")).collect(Collectors.toList());
            String carName = carsInputList.get(0);
            int mileage = Integer.parseInt(carsInputList.get(1));
            int fuel = Integer.parseInt(carsInputList.get(2));
            Car car = new Car(carName, mileage, fuel);
            carsList.add(car);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            List<String> commandsList = Arrays.stream(input.split("\\s+\\:\\s+")).collect(Collectors.toList());
            String command = commandsList.get(0);
            String inputCar = commandsList.get(1);
            int distance;
            int fuel;
            switch (command) {
                case "Drive":
                    //"Drive : {car} : {distance} : {fuel}":
                    distance = Integer.parseInt(commandsList.get(2));
                    fuel = Integer.parseInt(commandsList.get(3));

                    for (Car c : carsList) {
                        if (c.getCarName().equals(inputCar)) {
                            if (fuel > c.getFuel()) {
                                System.out.println("Not enough fuel to make that ride");
                            } else {
                                c.setMileage(c.getMileage() + distance);
                                c.setFuel(c.getFuel() - fuel);
                                System.out.println(inputCar + " driven for " + distance + " kilometers. " + fuel + " liters of fuel consumed.");
                            }
                            if (c.getMileage() > 100000) {
                                System.out.println("Time to sell the " + inputCar + "!");
                                c.setCarName("Remove");
                            }
                        }
                    }
                    break;
                case "Refuel":
                    //"Refuel : {car} : {fuel}"
                    fuel = Integer.parseInt(commandsList.get(2));
                    for (Car c : carsList) {
                        if (c.getCarName().equals(inputCar)) {
                            if (c.getFuel() + fuel > 75) {
                                System.out.println(inputCar + " refueled with " + (75 - c.getFuel()) + " liters");
                                c.setFuel(75);
                            } else {
                                c.setFuel(c.getFuel() + fuel);
                                System.out.println(inputCar + " refueled with " + fuel + " liters");
                            }

                        }
                    }
                    break;
                case "Revert":
                    //Revert : {car} : {kilometers}
                    distance = Integer.parseInt(commandsList.get(2));
                    for (Car c : carsList) {
                        if (c.getCarName().equals(inputCar)) {
                            c.setMileage(c.getMileage() - distance);
                            if (c.getMileage() >= 10000) {
                                System.out.println(inputCar + " mileage decreased by " + distance + " kilometers");
                            } else {
                                c.setMileage(10000);
                            }
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Car c : carsList) {
            //{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt.
            if (!c.getCarName().equals("Remove")) {
                System.out.println(c.getCarName() + " -> Mileage: " + c.getMileage() + " kms, Fuel in the tank: " + c.getFuel() + " lt.");
            }
        }
    }
}