package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> inputList = Arrays
                .stream(scanner.next().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> map = new TreeMap<>();

        for (int i = 0; i < inputList.size(); i++) {
            double currentNumber = inputList.get(i);
            if (map.containsKey(currentNumber)) {
                map.put(currentNumber, (map.get(currentNumber) + 1));
            } else map.put(currentNumber, 1);
        }

        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
