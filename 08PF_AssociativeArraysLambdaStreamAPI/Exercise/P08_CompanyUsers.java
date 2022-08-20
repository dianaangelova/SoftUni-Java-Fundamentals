package Exsercise;

import java.util.*;
import java.util.stream.Collectors;

public class P08_CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            List<String> inputList = Arrays.stream(input.split(" -> ")).collect(Collectors.toList());
            String companyName = inputList.get(0);
            String employeeName = inputList.get(1);

            if (!companyMap.containsKey(companyName)) {
                companyMap.put(companyName, new ArrayList<>());
                companyMap.get(companyName).add(employeeName);
            } else if (companyMap.containsKey(companyName)) {
                for (Map.Entry<String, List<String>> comp : companyMap.entrySet()) {
                    if (comp.getKey().equals(companyName)) {
                        if (!companyMap.get(companyName).contains(employeeName)) {
                            companyMap.get(companyName).add(employeeName);
                        }
                    }
                }
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> c : companyMap.entrySet()) {
            System.out.println(c.getKey());
            for (String s : c.getValue()) {
                System.out.println("-- " + s);
            }
        }
    }
}
