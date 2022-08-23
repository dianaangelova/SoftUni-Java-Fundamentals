package Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_MatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Pattern pattern= Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(text);
        boolean foundSomething = matcher.find();
        while (foundSomething) {
            System.out.print(matcher.group()+" ");
            foundSomething = matcher.find();
        }
    }
}
