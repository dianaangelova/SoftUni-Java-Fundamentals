package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        while (!data[0].equals("End")) {

            if (data[0].equals("Add")) {
                integerList.add(Integer.valueOf(data[1]));

            } else if (data[0].equals("Insert")) {
                if (Integer.parseInt(data[2]) >= integerList.size() || Integer.parseInt(data[2])<0) {
                    System.out.println("Invalid index");
                } else {
                    integerList.add(Integer.parseInt(data[2]), Integer.valueOf(data[1]));
                }

            } else if (data[0].equals("Remove")) {
                if (Integer.parseInt(data[1]) >= integerList.size() || Integer.parseInt(data[1])<0) {
                    System.out.println("Invalid index");
                } else {
                    integerList.remove(Integer.parseInt(data[1]));
                }

            } else if (data[1].equals("left"))
            // Shift left {count} - first number becomes last 'count' times
            {
                int countLeft = 0;
                countLeft = Integer.parseInt(data[2]);
                for (int i = 0; i < countLeft; i++) {
                    //integerList.get(integerList.size()) = in
                    integerList.add(integerList.get(0));
                    integerList.remove(0);
                }

            } else if (data[1].equals("right"))
            //Shift right {count} - last number becomes first 'count' times
            {
                int countRight = 0;
                countRight = Integer.parseInt(data[2]);
                for (int i = 0; i < countRight; i++) {
                    //integerList.get(integerList.size()) = in
                    integerList.add(0, integerList.get(integerList.size() - 1));
                    integerList.remove(integerList.size() - 1);
                }
            }
            data = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
