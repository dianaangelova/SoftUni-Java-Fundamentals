package P05_ProgrammingFundamentalsFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        //String working= input.replace("**", "::");

        Pattern pattern = Pattern.compile("[0-9]{1}");
        Matcher matcher = pattern.matcher(input);
        long coolThreshold = 1;
        while (matcher.find()) {
            coolThreshold = (long) coolThreshold * (long) Integer.parseInt(matcher.group());
        }
        System.out.println("Cool threshold: " + coolThreshold);

        Pattern patternEm = Pattern.compile("(::|\\*\\*)([A-Z][a-z][a-z]+)\\1");
        Matcher matcherEm = patternEm.matcher(input);
        Map<String, Integer> emojiMap = new LinkedHashMap<>();

        while (matcherEm.find()) {
            String emojiFull = matcherEm.group();
            String emojiName = emojiFull.substring(2, emojiFull.length() - 2);
            int charSum = 0;
            for (int i = 0; i < emojiName.length(); i++) {
                int charIndex = emojiName.charAt(i);
                charSum += charIndex;
            }
            emojiMap.put(emojiFull, charSum);
        }
        int count = 0;
        for (String e : emojiMap.keySet()) {
            {
                count++;
            }
        }
        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (Map.Entry<String, Integer> e : emojiMap.entrySet()) {
            if (e.getValue() > coolThreshold) {
                System.out.println(e.getKey());
            }
        }
    }
}
