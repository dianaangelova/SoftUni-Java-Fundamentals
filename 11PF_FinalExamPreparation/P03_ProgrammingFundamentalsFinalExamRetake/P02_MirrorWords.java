package P03_ProgrammingFundamentalsFinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern patternPair = Pattern.compile("([#@])(?<name1>[A-Za-z]{3,})\\1\\1(?<name2>[A-Za-z]{3,})\\1");
        Matcher matcherPair = patternPair.matcher(text);
        List<String> pairsList = new ArrayList<>();

        int countPairs = 0;
        while (matcherPair.find()) {
            countPairs++;
            pairsList.add(matcherPair.group(0));

        }
        if (countPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countPairs + " word pairs found!");
        }

        Pattern pattern = Pattern.compile("([#@])(?<name>[A-Za-z]{3,})\\1");
        Map<String, String> mirrorsMap = new LinkedHashMap<>();
        Matcher matcher;

        for (String s : pairsList) {
            matcher = pattern.matcher(s);

            while (matcher.find()) {
                String firstMatch = matcher.group();
                int firstMatchLength = firstMatch.length();
                int firstMatchIndex = s.indexOf(firstMatch);
                if (s.length() >= firstMatchIndex + firstMatchLength * 2) {
                    String secondString = s.substring(firstMatchIndex + firstMatchLength, firstMatchIndex + firstMatchLength + firstMatchLength);
                    String secondStringReversed = "";
                    for (int i = secondString.length() - 1; i >= 0; i--) {
                        secondStringReversed += secondString.charAt(i);
                    }
                    if (firstMatch.equals(secondStringReversed)) {
                        firstMatch = firstMatch.substring(1, firstMatchLength - 1);
                        secondString = secondString.substring(1, secondString.length() - 1);
                        mirrorsMap.put(firstMatch, secondString);
                    }
                }
            }

        }


        if (mirrorsMap.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");

            int count = 0;
            for (String m : mirrorsMap.keySet()) {
                {
                    count++;
                }
            }

            for (Map.Entry<String, String> m : mirrorsMap.entrySet()) {
                if (count > 1) {
                    System.out.printf("%s <=> %s, ", m.getKey(), m.getValue());
                    count--;
                } else System.out.printf("%s <=> %s", m.getKey(), m.getValue());
            }


        }
    }
}
