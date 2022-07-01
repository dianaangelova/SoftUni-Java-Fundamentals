package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String inputSpace = "";
        for (int i = 0; i < input.length(); i++) {
            inputSpace = input.replace("|", " | ");
        }
        List<String> stringList = Arrays.stream(inputSpace.split("\\s+")).collect(Collectors.toList());

        List<String> stringResult = new ArrayList<>();
        for (int i = stringList.size() - 1; i >= 0; i--) {

            while (stringList.get(i).equals("|") && i != (stringList.size()) - 1) {
                stringResult.add(stringList.get(i + 1));
                stringList.remove(i + 1);
            }
        }
        stringResult.addAll(stringList);

        for (int i = 0; i < stringResult.size(); i++) {
            stringResult.remove("|");
        }

        for (int i = 0; i < stringResult.size(); i++) {
            System.out.print(stringResult.get(i));
            System.out.print(" ");
        }

    }
}
