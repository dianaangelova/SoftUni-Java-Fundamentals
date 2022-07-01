package Exercise;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] data = scanner.nextLine().split("\\s+");
        while (!data[0].equals("end")) {
            if (data[0].equals("Delete")) {
                {
                    for (int i = 0; i < integerList.size(); i++) {
                        //
                        // remove OBJECT not index //
                        integerList.remove(Integer.valueOf(data[1]));
                        //
                    }

                }
            } else if (data[0].equals("Insert")) {
                int index = Integer.parseInt(data[1]);
                int element = Integer.parseInt(data[2]);
                integerList.add(element, index);
            }
            data = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
