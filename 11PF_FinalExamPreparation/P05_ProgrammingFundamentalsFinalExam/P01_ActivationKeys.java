package P05_ProgrammingFundamentalsFinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();

        String data = scanner.nextLine();

        while (!data.equals("Generate")) {
            List<String> dataList = Arrays.stream(data.split(">>>")).collect(Collectors.toList());
            String command = dataList.get(0);

            switch (command) {
                case "Contains":
                    String substring = dataList.get(1);
                    if (activationKey.contains(substring)) {
                        System.out.println(activationKey + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperLower = dataList.get(1);
                    int startIndexF = Integer.parseInt(dataList.get(2));
                    int endIndexF = Integer.parseInt(dataList.get(3));
                    String firstPart = activationKey.substring(0, startIndexF);
                    String secondPart = activationKey.substring(endIndexF);
                    String activationKeyLowUp = activationKey.substring(startIndexF, endIndexF);

                    if (upperLower.equals("Upper")) {
                        activationKeyLowUp = activationKeyLowUp.toUpperCase();
                    } else {
                        activationKeyLowUp = activationKeyLowUp.toLowerCase();
                    }
                    activationKey = firstPart + activationKeyLowUp + secondPart;
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    int startIndexS = Integer.parseInt(dataList.get(1));
                    int endIndexS = Integer.parseInt(dataList.get(2));
                    String firstPartS = activationKey.substring(0, startIndexS);
                    String secondPartS = activationKey.substring(endIndexS);
                    activationKey=firstPartS+secondPartS;
                    System.out.println(activationKey);
                    break;
            }


            data = scanner.nextLine();
        }
        System.out.println("Your activation key is: "+activationKey);

    }
}
