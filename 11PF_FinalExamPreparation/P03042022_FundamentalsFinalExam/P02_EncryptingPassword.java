package P03042022_FundamentalsFinalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            boolean found = false;
            String data = scanner.nextLine();
            Pattern pattern = Pattern.compile("^(.*)>([0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[^\\>\\<]{3})<\\1$");
            Matcher matcher = pattern.matcher(data);
            while (matcher.find()) {
                String encrypted = matcher.group(2);
                Pattern patternIn = Pattern.compile("(?<numbers>[0-9]{3})\\|(?<smallLetters>[a-z]{3})\\|(?<bigLetters>[A-Z]{3})\\|(?<symbols>[^\\>\\<]{3})");
                Matcher matcherIn = patternIn.matcher(encrypted);
                String password = "";
                String numbers = "";
                String smallLetters = "";
                String bigLetters = "";
                String symbols = "";
                while (matcherIn.find()) {
                    numbers = matcherIn.group("numbers");
                    smallLetters = matcherIn.group("smallLetters");
                    bigLetters = matcherIn.group("bigLetters");
                    symbols = matcherIn.group("symbols");

                }
                password = numbers + smallLetters + bigLetters + symbols;

                System.out.println("Password: " + password);
                found = true;
            }
            if (!found) {
                System.out.println("Try another password!");
            }
        }


    }
}
