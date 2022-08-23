package Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P06_Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> classMap = new LinkedHashMap<>();
        while (!input.equals("end")) {
            List<String> inputList = Arrays.stream(input.split(" : ")).collect(Collectors.toList());
            String className = inputList.get(0);
            String studentName = inputList.get(1);

            if (!classMap.containsKey(className)) {
                classMap.put(className, new ArrayList<String>());
            }
            classMap.get(className).add(studentName);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> c : classMap.entrySet()) {
            int sizeList = c.getValue().size();
            System.out.println(c.getKey() + ": " + sizeList);
            for (String s : c.getValue()) {
                System.out.println("-- " + s);
            }
        }
    }
}
