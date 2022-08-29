package P01_ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        while (!stringList.get(0).equals("Decode")) {
            String command = stringList.get(0);
            switch (command) {
                case "Move":
                    int numberLetters = Integer.parseInt(stringList.get(1));
                    String firstPart = message.substring(0, numberLetters);
                    String secondPart = message.substring(numberLetters);
                    message = secondPart + firstPart;
                    break;
                case "Insert":
                    int index = Integer.parseInt(stringList.get(1));
                    String value = stringList.get(2);
                    String firstPart1 = message.substring(0, index);
                    String secondPart1 = message.substring(index);
                    message = firstPart1 + value + secondPart1;
                    break;
                case "ChangeAll":
                    String oldValue = stringList.get(1);
                    String newValue = stringList.get(2);
                    message = message.replace(oldValue, newValue);
                    break;
            }
            stringList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        }

        System.out.printf("The decrypted message is: %s", message);
    }
}
