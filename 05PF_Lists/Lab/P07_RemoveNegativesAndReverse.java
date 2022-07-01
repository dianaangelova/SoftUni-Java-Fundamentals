package Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = integerList.size()-1; i >=0; i--) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
            }
        }
        Collections.reverse(integerList);
        if (integerList.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(integerList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
