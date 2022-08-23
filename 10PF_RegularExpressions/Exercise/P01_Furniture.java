package Exercise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = ">>(?<furniture>[\\w]+)<<(?<price>(\\d+(\\.\\d+)?))!(?<quantity>\\d+)\\b";

        List<String> furnitureArr = new ArrayList<>();
        //List<Double> priceArr = new ArrayList<>();
        //List<Integer> quantityArr = new ArrayList<>();

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        double finalSum = 0;
        while (!text.equals("Purchase")) {
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                furnitureArr.add(matcher.group("furniture"));
                double price = (Double.parseDouble(matcher.group("price")));
                int quantity = (Integer.parseInt(matcher.group("quantity")));
                finalSum += price * quantity;
            }
            text = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitureArr.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", finalSum);

    }
}
