package P01_ProgrammingFundamentalsFinalExamRetake;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("([|#])(?<name>[\\sA-Za-z]+)\\1(?<expdate>[\\d]{2}\\/[\\d]{2}\\/[\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
        Matcher matcher = pattern.matcher(text);
        int sumCalories = 0;
        double days;
        List<String> nameArr = new LinkedList<>();
        List<String> expDateArr = new LinkedList<>();
        List<Integer> caloriesArr = new LinkedList<>();
        while (matcher.find()) {
            String name = matcher.group("name");
            String expDate = matcher.group("expdate");
            int calories = Integer.parseInt(matcher.group("calories"));
                nameArr.add(name);
                expDateArr.add(expDate);
                caloriesArr.add(calories);
                sumCalories += calories;
        }
        days = Math.floor(sumCalories * 1.0 / 2000);
        System.out.printf("You have food to last you for: %.0f days!%n", days);
        for (int i = 0; i < nameArr.size() && days > 0; i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", nameArr.get(i), expDateArr.get(i), caloriesArr.get(i));
        }

    }
}
