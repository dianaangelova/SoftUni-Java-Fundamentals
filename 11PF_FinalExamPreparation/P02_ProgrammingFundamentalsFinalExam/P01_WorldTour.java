package P02_ProgrammingFundamentalsFinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destinations = scanner.nextLine();
        String data = scanner.nextLine();
        while (!data.equals("Travel")) {
            List<String> dataList = Arrays.stream(data.split("\\:")).collect(Collectors.toList());
            String command = dataList.get(0);
            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(dataList.get(1));
                if (index >= 0 && index <= destinations.length()) {
                    String newDestination = dataList.get(2);

                    String firstString = destinations.substring(0, index);
                    String secondString = destinations.substring(index);

                    destinations = firstString + newDestination + secondString;
                }
                System.out.println(destinations);

            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(dataList.get(1));
                int endIndex = Integer.parseInt(dataList.get(2));
                if (startIndex >= 0 && startIndex < destinations.length()) {
                    if (endIndex > 0 && endIndex < destinations.length()) {
                        {
                            String firstString = destinations.substring(0, startIndex);
                            String secondString = destinations.substring(endIndex + 1);
                            destinations = firstString + secondString;
                        }
                    }
                }
                System.out.println(destinations);

            } else if (command.equals("Switch")) {
                String oldDestination = dataList.get(1);
                String newDestination = dataList.get(2);

                destinations = destinations.replace(oldDestination, newDestination);
                System.out.println(destinations);
            }
            data = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + destinations);
    }
}
