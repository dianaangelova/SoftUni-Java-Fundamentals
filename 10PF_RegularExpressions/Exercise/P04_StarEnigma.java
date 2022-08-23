package Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String regexKey = "[starSTAR]";
        String regexDecrypted = "^[^@\\-!:>]*@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldier>\\d+)[^@\\-!:>]*$";
        String attackType;
        String planetName;
        int population;
        int soldier;
        List<String> attachedPlanets = new LinkedList<>();
        List<String> destroyedPlanets = new LinkedList<>();

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            Pattern patternName = Pattern.compile(regexKey);
            Matcher matcherName = patternName.matcher(input);
            int countStarChars = 0;
            while (matcherName.find()) {
                countStarChars++;
            }
            StringBuilder sb = new StringBuilder();
                for (int j = 0; j < input.length(); j++) {
                    int charValue = input.charAt(j);
                    int newCharValue = charValue - countStarChars;
                    sb.append(Character.toChars(newCharValue));
            }
            String decrypted = sb.toString();
            Pattern patternDecrypted = Pattern.compile(regexDecrypted);
            Matcher matcherDecrypted = patternDecrypted.matcher(decrypted);
            attackType = "";
            planetName = "";
            population = -1;
            soldier = -1;
            while (matcherDecrypted.find()) {
                planetName = matcherDecrypted.group("name");
                population = Integer.parseInt(matcherDecrypted.group("population"));
                attackType = matcherDecrypted.group("attackType");
                soldier = Integer.parseInt(matcherDecrypted.group("soldier"));
            }
            if (attackType.equals("A")) {
                attachedPlanets.add(planetName);
            } else if (attackType.equals("D")) {
                destroyedPlanets.add(planetName);
            }
        }
        System.out.printf("Attacked planets: %d%n", attachedPlanets.size());
        Collections.sort(attachedPlanets);
        Collections.sort(destroyedPlanets);
        for (String s : attachedPlanets) {
            System.out.println("-> " + s);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String s : destroyedPlanets) {
            System.out.println("-> " + s);
        }
    }
}
