package Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P06_ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            stringList.add(i, product);
        }
        Collections.sort(stringList);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println((i+1)+"."+stringList.get(i));
        }
    }
}

