package Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_Race2 {
    public static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        Map<String, Integer> players = new LinkedHashMap<>() {{
            for (int i = 0; i < names.size(); i++) {
                put(names.get(i), 0);
            }
        }};
        String input = scanner.nextLine();
        String regexName = "[A-Za-z]+";
        String regexNum = "\\d";
        while (!input.equals("end of race")) {
            Pattern patternName = Pattern.compile(regexName);
            Pattern patternNum = Pattern.compile(regexNum);
            Matcher matcherName = patternName.matcher(input);
            Matcher matcherNum = patternNum.matcher(input);
            StringBuilder sb = new StringBuilder();
            int km = 0;
            while (matcherName.find()) {
                sb.append(matcherName.group());
            }
            String name = String.valueOf(sb);
            if (players.containsKey(name)) {
                while (matcherNum.find()) {
                    km += Integer.parseInt((matcherNum.group()));
                }
                players.put(name, km + players.get(name));
            }
            input = scanner.nextLine();
        }
        String[] num = new String[]{"1st", "2nd", "3rd"};
        players.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .forEach(e -> {
                    System.out.printf("%s place: %s%n", num[index], e.getKey());
                    index++;
                });
    }
}