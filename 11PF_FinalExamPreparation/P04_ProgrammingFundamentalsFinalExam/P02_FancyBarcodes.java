package P04_ProgrammingFundamentalsFinalExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String data = scanner.nextLine();
            Pattern pattern = Pattern.compile("(@#+)([A-Z][A-Za-z0-9]{4,}[A-Z])(@#+)");
            Matcher matcher = pattern.matcher(data);
            if (matcher.find()) {
                String digit = "";
                String digitResult = "";
                String matchedString = matcher.group(2);
                Pattern patternDigit = Pattern.compile("[0-9]");
                Matcher matcherDigit = patternDigit.matcher(matchedString);
                while (matcherDigit.find()) {
                    digit = matcherDigit.group(0);
                    digitResult += digit;
                }
                if (digitResult.equals("")) {
                    digitResult = "00";
                }
                System.out.println("Product group: " + digitResult);
            } else {
                System.out.println("Invalid barcode");
            }

        }

    }
}
