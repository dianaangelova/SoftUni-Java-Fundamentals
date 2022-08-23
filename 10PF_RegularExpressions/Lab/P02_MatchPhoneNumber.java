package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\+359(?<separator>\\s||-)[2](\\1)[0-9]{3}(\\1)[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(text);
        List<String> phoneResultArr = new ArrayList<>();
        while (matcher.find()) {
            phoneResultArr.add(matcher.group());
        }
        System.out.println(String.join(", ", phoneResultArr));
    }
}
