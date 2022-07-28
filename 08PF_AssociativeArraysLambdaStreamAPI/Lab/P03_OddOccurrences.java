package Lab;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class P03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> wordsMap = new LinkedHashMap<>();

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        for (int i = 0; i < inputList.size(); i++) {

            String word = (inputList.get(i).toLowerCase());
            int currentNumber;
            if (!wordsMap.containsKey(word)) {
                // the key is new
                wordsMap.put(word, 1);
            } else
                // the key exists
                wordsMap.put(word, (wordsMap.get(word) + 1));
            //    System.out.println();
        }

        List<String> oddsList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddsList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddsList));

    }
}
