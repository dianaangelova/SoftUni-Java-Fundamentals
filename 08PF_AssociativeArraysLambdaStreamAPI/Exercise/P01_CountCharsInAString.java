package Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll("\\s+", "");
        int count;

        Map<Character, Integer> charNumberMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            if (!charNumberMap.containsKey(character)) {
                charNumberMap.put(character, 1);
            } else {
                count = charNumberMap.get(character);
                charNumberMap.put(character, count + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charNumberMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
