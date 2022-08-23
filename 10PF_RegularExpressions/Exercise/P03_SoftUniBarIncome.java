package Exercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>[\\w]+)>[^|$%.]*\\|(?<count>[\\d]+)\\|[^|$%.\\d]*(?<price>[\\d]+(.[\\d]+)?)\\$";

        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile(regex);
        double sum = 0.0;
        while (!text.equals("end of shift")) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", customer, product, count*price);
                sum += count * price;
            }
            text = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", sum);
    }
}
