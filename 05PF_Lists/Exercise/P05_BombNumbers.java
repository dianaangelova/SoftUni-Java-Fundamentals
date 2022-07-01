package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] integerArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        //Integer[] data = scanner.nextLine().split("\\s+");

        int specNum = integerArr[0];
        int power = integerArr[1];
        int indexOfSpecNumber = 0;

        while (integerList.contains(specNum)) {
            for (int i = 0; i < power; i++) {
                indexOfSpecNumber = integerList.indexOf(specNum);
                if (indexOfSpecNumber + 1 < integerList.size()) {
                    integerList.remove(indexOfSpecNumber + 1);
                }
                if (indexOfSpecNumber - 1 >= 0) {
                    integerList.remove(indexOfSpecNumber - 1);
                }
            }
            integerList.remove(Integer.valueOf(specNum));
        }

        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum = sum + integerList.get(i);
        }
        System.out.print(sum);
    }
}
