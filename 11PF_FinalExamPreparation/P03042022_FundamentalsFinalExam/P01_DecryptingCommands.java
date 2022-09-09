package P03042022_FundamentalsFinalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P01_DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
            String command = inputList.get(0);
            switch (command) {
                case "Replace":
                    String currentChar = inputList.get(1);
                    String newChar = inputList.get(2);
                    data = data.replace(currentChar, newChar);
                    System.out.println(data);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(inputList.get(1));
                    int endIndex = Integer.parseInt(inputList.get(2));
                    if (startIndex >= 0 && endIndex < data.length()) {
                        String firstPartCut = data.substring(0, startIndex);
                        String secondPartCut = data.substring(endIndex + 1);
                        data = firstPartCut + secondPartCut;
                        System.out.println(data);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperLower = inputList.get(1);
                    if (upperLower.equals("Upper")) {
                        data = data.toUpperCase();
                    } else {
                        data = data.toLowerCase();
                    }
                    System.out.println(data);
                    break;
                case "Check":
                    String checkStr = inputList.get(1);
                    if (data.contains(checkStr)) {
                        System.out.println("Message contains " + checkStr);
                    } else {
                        System.out.println("Message doesn't contain " + checkStr);
                    }
                    break;
                case "Sum":
                    int startIndexSum = Integer.parseInt(inputList.get(1));
                    int endIndexSum = Integer.parseInt(inputList.get(2));
                    if (startIndexSum >= 0 && endIndexSum < data.length()) {
                        String sumSubstr = data.substring(startIndexSum, endIndexSum+1);
                        int sum = 0;
                        for (int i = 0; i < sumSubstr.length(); i++) {
                            char c = sumSubstr.charAt(i);
                            sum += c;
                        }
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }

            input = scanner.nextLine();
        }


    }
}
