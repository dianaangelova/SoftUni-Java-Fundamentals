package Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// P02_Race is my solution.

public class P02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "";
        List<String> input = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String text = scanner.nextLine();
        Map<String, Integer> map = new LinkedHashMap<>();
        while (!text.equals("end of race")) {
            String replacedName = text.replaceAll("[^A-Za-z]+", "");
            String replacedScore = (text.replaceAll("[^\\d]", ""));
            int sum = 0;
            for (int i = 0; i < replacedScore.length(); i++) {
                int integer = Integer.parseInt(String.valueOf(replacedScore.charAt(i)));
                sum += integer;
            }
            if (input.contains(replacedName)) {
                if (map.containsKey(replacedName)) {
                    map.put(replacedName, map.get(replacedName) + sum);
                } else map.put(replacedName, sum);
            }
            text = scanner.nextLine();
        }

        String[] num = new String[]{"1st", "2nd", "3rd"};
        final int[] i = {0};
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .forEach(s -> {
                    System.out.printf("%s place: %s%n", num[i[0]], s.getKey());
                    i[0]++;
                });


    }
}