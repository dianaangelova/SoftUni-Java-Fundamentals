package Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCommands = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();

        while (numberCommands > 0) {
            List<String> data = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .collect(Collectors.toList());
            if (data.size() == 3) {
                // is going
                if (guests.contains(data.get(0))) {
                    System.out.println(data.get(0) + " is already in the list!");

                } else {
                    guests.add(data.get(0));
                }

            } else if (data.size() == 4) {
                //is not going
                if (!guests.contains(data.get(0))) {
                    System.out.print(data.get(0) + " is not in the list!" + "\n");
                } else {
                    //Remove value of String
                    guests.remove(String.valueOf(data.get(0)));
                }

            }
            numberCommands--;
        }
        for (int i = 0; i < guests.size(); i++) {
            System.out.print(guests.get(i) + "\n");
        }
    }
}
