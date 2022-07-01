package Lab;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        while (!data[0].equals("end")) {
            int number1 = Integer.parseInt(data[1]);
            switch (data[0]) {
                case ("Add"):
                    integerList.add(number1);
                    break;
                case ("Remove"):
                    integerList.remove(Integer.valueOf(number1));
                    break;
                case ("RemoveAt"):
                    integerList.remove(number1);
                    break;
                case ("Insert"):
                    int number2 = Integer.parseInt(data[2]);
                    integerList.add(number2, number1);
                    break;
            }
            data = scanner.nextLine().split("\\s+");
        }
        System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));

    }
}
