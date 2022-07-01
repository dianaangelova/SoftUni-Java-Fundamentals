package Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> doubleList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        extracted(doubleList);
    }

    private static void extracted(List<Double> doubleList) {
        for (int i = 0; i < doubleList.size(); i++) {
            if (i + 1 < doubleList.size()) {
                if (doubleList.get(i).equals(doubleList.get(i + 1))) {
                    double sum = 0;
                    sum = doubleList.get(i) + doubleList.get(i + 1);
                    doubleList.set(i, sum);
                    doubleList.remove(i + 1);
                    i = -1;
                }
            }

        }
        for (int k = 0; k < doubleList.size(); k++) {
            String output;
            output=new DecimalFormat("0.#").format(doubleList.get(k));
            System.out.printf(output+" ");

        }
    }
}
