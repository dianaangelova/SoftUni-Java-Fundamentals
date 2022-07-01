package Lab;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" ");
        while (!data[0].equals("end")) {

            switch (data[0]) {
                case ("Contains"):
                    int number1 = Integer.parseInt(data[1]);
                    if (integerList.contains(number1)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case ("Print"):
                    if (data[1].equals("even")) {
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) % 2 == 0) {
                                System.out.print(integerList.get(i) + " ");
                            }
                        }
                    } else if (data[1].equals("odd")) {
                        System.out.println();
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) % 2 != 0) {
                                System.out.print(integerList.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case ("Get"):
                    int sum = 0;
                    for (int i = 0; i < integerList.size(); i++) {
                        sum += integerList.get(i);
                    }
                    System.out.print(sum);
                    break;
                case ("Filter"):
                    String operator = data[1];
                    int number2 = Integer.parseInt(data[2]);
                    switch (operator) {
                        case "<":
                            System.out.println();
                            for (int i = 0; i < integerList.size(); i++) {
                                if (integerList.get(i) < number2) {
                                    System.out.print(integerList.get(i) + " ");
                                }
                            }
                            break;
                        case ">":
                            System.out.println();
                            for (int i = 0; i < integerList.size(); i++) {
                                if (integerList.get(i) > number2) {
                                    System.out.print(integerList.get(i) + " ");
                                }
                            }
                            break;
                        case ">=":
                            System.out.println();
                            for (int i = 0; i < integerList.size(); i++) {
                                if (integerList.get(i) >= number2) {
                                    System.out.print(integerList.get(i) + " ");
                                }
                            }
                            break;
                        case "<=":
                            System.out.println();
                            for (int i = 0; i < integerList.size(); i++) {
                                if (integerList.get(i) <= number2) {
                                    System.out.print(integerList.get(i) + " ");
                                }
                            }
                            break;
                    }
                    break;
            }
            data = scanner.nextLine().split(" ");
        }
    }
}
