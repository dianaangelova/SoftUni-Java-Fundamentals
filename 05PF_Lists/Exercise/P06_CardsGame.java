package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> cardsPlayer1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cardsPlayer2 = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        while (!cardsPlayer1.isEmpty() && !cardsPlayer2.isEmpty()) {
            if (cardsPlayer1.get(0) > cardsPlayer2.get(0)) {
                cardsPlayer1.add(cardsPlayer1.get(0));
                cardsPlayer1.add(cardsPlayer2.get(0));
                cardsPlayer1.remove(0);
                cardsPlayer2.remove(0);
            } else if (cardsPlayer2.get(0) > cardsPlayer1.get(0)) {
                cardsPlayer2.add(cardsPlayer2.get(0));
                cardsPlayer2.add(cardsPlayer1.get(0));
                cardsPlayer2.remove(0);
                cardsPlayer1.remove(0);
            } else if (cardsPlayer1.get(0).equals(cardsPlayer2.get(0))) {
                cardsPlayer1.remove(0);
                cardsPlayer2.remove(0);
            }
        }
        int sum = 0;
        if (!cardsPlayer1.isEmpty()) {
            // first wins
            for (Integer integer : cardsPlayer1) {
                sum = sum + integer;
            }
            System.out.printf("First player wins! Sum: %d", sum);

        } else if (!cardsPlayer2.isEmpty()) {
            for (Integer integer : cardsPlayer2) {
                sum = sum + integer;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
//
        if (cardsPlayer1.isEmpty() && cardsPlayer2.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
