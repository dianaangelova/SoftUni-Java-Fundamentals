package P03_ProgrammingFundamentalsFinalExamRetake;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealed = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            List<String> inputList = Arrays.stream(input.split(":\\|:")).collect(Collectors.toList());
            String command = inputList.get(0);

            switch (command) {
                case "InsertSpace":
                    StringBuilder sb = new StringBuilder();
                    int index = Integer.parseInt(inputList.get(1));
                    //String firstPart = concealed.substring(0, index);
                    //String secondPart = concealed.substring(index);
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    sb1 = new StringBuilder(concealed.substring(0, index));
                    sb2 = new StringBuilder(concealed.substring(index));
                    sb.append(sb1).append(" ").append(sb2);
                    //concealed = firstPart + " " + secondPart;
                    //System.out.println(concealed);
                    concealed = sb.toString();
                    System.out.println(concealed);
                    break;

                case "Reverse":
                    String reverseString = inputList.get(1);
                    if (concealed.contains(reverseString)) {
                        int indexReverseStr = concealed.indexOf(reverseString);
                        int lengthReverseStr = reverseString.length();
                        String firstPartR = concealed.substring(0, indexReverseStr);
                        String secondPartR = concealed.substring(indexReverseStr + lengthReverseStr);
                        String reversedStr = "";

                        for (int i = lengthReverseStr - 1; i >= 0; i--) {
                            Character character = reverseString.charAt(i);
                            reversedStr = reversedStr + character;
                        }

                        concealed = firstPartR + secondPartR + reversedStr;
                        System.out.println(concealed);

                    } else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String oldString = inputList.get(1);
                    String newString = inputList.get(2);

                    concealed = concealed.replace(oldString, newString);

                    System.out.println(concealed);

                    break;
            }


            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + concealed);

    }
}
