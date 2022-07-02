package Exam_22Febr2022;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> resultList = new ArrayList<>(0);

        while (!stringList.get(0).equals("end")) {
            String command = stringList.get(0);
            switch (command) {
                case "Chat":
                    if (resultList.size() > 0) {
                        resultList.add(resultList.size() , stringList.get(1));
                    } else if (resultList.isEmpty()) {
                        resultList.add(stringList.get(1));
                    }
                    break;
                case "Delete":
                    if (resultList.contains(stringList.get(1))) {
                        resultList.remove(stringList.get(1));
                    }
                    break;
                case "Edit":
                    if (resultList.contains(stringList.get(1))) {
                        int index = resultList.indexOf(stringList.get(1));
                        resultList.add(index, stringList.get(2));
                        resultList.remove(stringList.get(1));
                    }
                    break;
                case "Pin":
                    if (resultList.contains(stringList.get(1))) {
                        resultList.add(stringList.get(1));
                        resultList.remove((stringList.get(1)));
                    }
                    break;
                case "Spam":
                    for (int i = 1; i < stringList.size(); i++) {
                        resultList.add(stringList.get(i));
                    }
                    break;
                case "end":
                    break;
            }
            stringList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        }
        for (int i = 0; i < resultList.size(); i++) {
            System.out.print(resultList.get(i));
            System.out.println();
        }


    }
}
