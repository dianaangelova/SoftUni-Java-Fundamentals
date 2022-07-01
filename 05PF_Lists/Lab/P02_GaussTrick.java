package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            while (i < integerList.size() / 2) {
                int sum = 0;
                sum = integerList.get(i) + integerList.get((integerList.size() - (1 + i)));
                resultList.add(sum);
                break;
            }
        }
        if (integerList.size() == 1) {
            resultList.add(integerList.get(0));
        } else if (integerList.size() % 2 != 0) {
            int middleInt = integerList.get(integerList.size() / 2 );
            resultList.add(middleInt);
        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
