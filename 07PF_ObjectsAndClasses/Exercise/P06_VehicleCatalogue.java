package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_VehicleCatalogue {
    public static class Vehicle {
        String typeOfVehicle;
        String model;
        String color;
        int horsepower;

        public Vehicle(String typeOfVehicle, String model, String color, int horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }

        @Override
        public String toString() {
            return "Type: " + this.typeOfVehicle.substring(0, 1).toUpperCase() + this.typeOfVehicle.substring(1) + '\n' +
                    "Model: " + this.model + '\n' +
                    "Color: " + this.color + '\n' +
                    "Horsepower: " + this.horsepower;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String[] input = scanner.nextLine().split(" ");
        while (!input[0].equals("End")) {
            String typeOfVehicle = input[0];
            String model = input[1];
            String color = input[2];
            int horsepower = Integer.parseInt(input[3]);

            Vehicle vehicle = new Vehicle(typeOfVehicle, model, color, horsepower);
            vehicleList.add(vehicle);
            input = scanner.nextLine().split(" ");
        }

        String modelData = scanner.nextLine();
        int countCarHorsepower = 0;
        int countCar = 0;
        int countTruckHorsepower = 0;
        int countTruck = 0;

        while (!modelData.equals("Close the Catalogue")) {
            for (Vehicle v : vehicleList) {
                if (modelData.equals(v.getModel())) {
                    System.out.println(v.toString());
                }
            }
            modelData = scanner.nextLine();
        }

        for (Vehicle v : vehicleList) {
            if (v.getTypeOfVehicle().equals("car")) {
                countCarHorsepower = countCarHorsepower + v.getHorsepower();
                countCar++;
            } else if (v.getTypeOfVehicle().equals("truck")) {
                countTruckHorsepower = countTruckHorsepower + v.getHorsepower();
                countTruck++;
            }
        }

        Double averageCarHourseP = 0.0;
        Double averageTruckHourseP = 0.0;

        if (countCarHorsepower == 0 && countCar == 0) {
            averageCarHourseP = 0.0;
        } else {
            averageCarHourseP = countCarHorsepower * 1.0 / countCar;
        }
        if (countTruckHorsepower == 0 && countTruck == 0) {
            averageTruckHourseP = 0.0;
        } else {
            averageTruckHourseP = countTruckHorsepower * 1.0 / countTruck;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarHourseP);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTruckHourseP);

    }
}
