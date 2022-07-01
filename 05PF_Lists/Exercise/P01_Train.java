package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listTrain = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String[] data = scanner.nextLine().split("\\s+");
        while (!data[0].equals("end")) {
            if (data[0].equals("Add")) {
                listTrain.add(Integer.parseInt(data[1]));
            } else {
                for (int i = 0; i < listTrain.size(); i++) {
                    int element = Integer.parseInt(data[0]);
                    if (listTrain.get(i) + element <= maxCapacity) {
                        listTrain.set(i, listTrain.get(i) + element);
                        break;
                    }
                }
            }
            data = scanner.nextLine().split("\\s+");
        }

        System.out.println(listTrain.toString().replaceAll("[\\[\\],]", ""));
    }
}
