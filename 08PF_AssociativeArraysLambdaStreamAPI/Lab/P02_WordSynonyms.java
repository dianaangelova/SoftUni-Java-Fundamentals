package Lab;

import java.util.*;

public class P02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordsMap = new LinkedHashMap<>();
        //ArrayList<String> synonymsArray = new ArrayList<>();
        for (int i = 0; i < number; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!wordsMap.containsKey(word)) {
                // the key is new
                wordsMap.put(word, new ArrayList<>());
                wordsMap.get(word).add(synonym);
            } else
                // the key exists
                wordsMap.get(word).add(synonym);

        }

        for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey() , (String.join(", ", entry.getValue())));
        }
    }
}
