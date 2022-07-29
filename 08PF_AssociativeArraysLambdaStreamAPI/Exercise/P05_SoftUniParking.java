package Exsercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        Map<String, String> parkingMap = new LinkedHashMap<>();

        for (int i = 0; i < number; i++) {

            List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            String command = inputList.get(0);
            String username = inputList.get(1);

            switch (command) {
                case "register":
                    String plate = inputList.get(2);

                    if (parkingMap.containsKey(username) && parkingMap.containsValue(plate)) {
                        System.out.println("ERROR: already registered with plate number " + plate);
                    } else {
                        parkingMap.put(username, plate);
                        System.out.println(username + " registered " + plate + " successfully");
                    }
                    break;
                case "unregister":
                    if (parkingMap.containsKey(username)) {
                        System.out.println(username + " unregistered successfully");
                        parkingMap.remove(username);
                    } else {
                        System.out.println("ERROR: user " + username + " not found");
                    }
                    break;
            }
        }

        parkingMap.forEach((key, value)->System.out.printf("%s => %s%n", key, value));
    }
}
