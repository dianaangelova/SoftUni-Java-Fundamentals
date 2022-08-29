package P02_ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=/])(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int sumLength=0;
        List<String> resultList= new ArrayList<>();
        while (matcher.find()) {
            resultList.add(matcher.group("destination"));
            sumLength+=matcher.group("destination").length();
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", resultList));
        System.out.println();
        System.out.println("Travel Points: "+sumLength);

    }
}
