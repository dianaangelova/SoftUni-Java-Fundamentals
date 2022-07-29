package Exsercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> studentMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            if (!studentMap.containsKey(name)) {
                studentMap.put(name, grade);
            } else {
                {
                    studentMap.replace(name, studentMap.get(name), (studentMap.get(name) + grade) / 2);

                }

            }
        }
        for (Map.Entry<String, Double> m : studentMap.entrySet()) {
            if (m.getValue() >= 4.50) {
                System.out.printf("%s -> %.2f%n", m.getKey(), m.getValue());
            }
        }

    }
}