package Exsercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesMap = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        while (!resource.equals("stop")) {
            if (!resourcesMap.containsKey(resource)) {
                resourcesMap.put(resource, quantity);
            } else {
                int currentQuantity = resourcesMap.get(resource);
                resourcesMap.put(resource, quantity + currentQuantity);
            }
            resource = scanner.nextLine();
            if (!resource.equals("stop")) {
                quantity = Integer.parseInt(scanner.nextLine());
            }
        }

        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
