package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> integerList2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();

        if (integerList1.size() >= integerList2.size()) {
            for (int i = 0; i < integerList1.size(); i++) {
                if (integerList1.size() == integerList2.size()) {
                    resultList.add(integerList1.get(i));
                    resultList.add(integerList2.get(i));
                } else if (integerList1.size() > integerList2.size()) {

                    resultList.add(integerList1.get(i));
                    int initSize2 = integerList2.size() - i;

                    while (initSize2 > 0) {
                        resultList.add(integerList2.get(i));
                        break;
                    }
                }
            }
        } else if (integerList2.size() > integerList1.size()) {
            for (int k = 0; k < integerList2.size(); k++) {
                int initSize1 = integerList1.size() - k;
                while (initSize1 > 0) {
                    resultList.add(integerList1.get(k));
                    break;
                }

                resultList.add(integerList2.get(k));
            }
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
    }
