package P04_ProgrammingFundamentalsFinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String input = scanner.nextLine();
        char takeOdd;
        String takeOddString = "";
        while (!input.equals("Done")) {
            List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String command = inputList.get(0);
            switch (command) {
                case "TakeOdd":
                    for (int i = 0; i < data.length(); i++) {
                        if (i % 2 != 0) {
                            takeOdd = data.charAt(i);
                            takeOddString = takeOddString + takeOdd;
                        }
                    }
                    data = takeOddString;
                    System.out.println(data);
                    break;
                case "Cut":
                    int index = Integer.parseInt(inputList.get(1));
                    int length = Integer.parseInt(inputList.get(2));
                    String firstString = data.substring(0, index);
                    String secondString = data.substring(index + length);
                    data = firstString + secondString;
                    System.out.println(data);
                    break;
                case "Substitute":
                    String substring = inputList.get(1);
                    String substitute = inputList.get(2);
                    if (data.contains(substring)) {
                        data = data.replace(substring, substitute);
                        System.out.println(data);
                    } else System.out.println("Nothing to replace!");
                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + data);
    }
}
