package March16RegEx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String keyRegex = "[starSTAR]";
        String messageRegex = "^[^@\\-!:>]*@(?<name>[A-Za-z]+)[^@\\-!:>]*:(?<population>\\d+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldier>\\d+)[^@\\-!:>]*$";
        Pattern keyPattern = Pattern.compile(keyRegex);
        Pattern messagePattern = Pattern.compile(messageRegex);
        List<String> attacked = new LinkedList<>();
        List<String> destroyed = new LinkedList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
            String message = scanner.nextLine();
            Matcher keyMatcher = keyPattern.matcher(message);
            int count = 0;
            while (keyMatcher.find()){
                count++;

            }
            StringBuilder sb = new StringBuilder(message);
            for (int j = 0; j <sb.length(); j++) {
                int newSymbol = sb.charAt(j)-count;
                sb.setCharAt(j,(char) newSymbol);
            }
            Matcher messageMatcher = messagePattern.matcher(sb.toString());
            while (messageMatcher.find()){
                String planetName= messageMatcher.group("name");
                int population = Integer.parseInt(messageMatcher.group("population"));
                String attack  = messageMatcher.group("attack");
                int soldierCount= Integer.parseInt(messageMatcher.group("soldier"));

                if (attack.equals("A")){
                    attacked.add(planetName);
                }else{
                    destroyed.add(planetName);
                }

            }
        }
        System.out.printf("Attacked planets: %d%n",attacked.size());
        attacked.stream().sorted(String::compareTo).forEach(p->System.out.printf("-> %s%n", p));
        System.out.printf("Destroyed planets: %d%n",destroyed.size());
        destroyed.stream().sorted(String::compareTo).forEach(p->System.out.printf("-> %s%n",p));



    }
}
