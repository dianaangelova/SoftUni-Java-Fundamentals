package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        getSmallestOutOfThree(n1, n2, n3);
    }

    private static void getSmallestOutOfThree(int n1, int n2, int n3) {
        List<Integer> integerList= new ArrayList<Integer>(3);
        integerList.add(n1);
        integerList.add(n2);
        integerList.add(n3);
        Collections.sort(integerList);

        System.out.println(integerList.get(0));
        return ;
    }
}
