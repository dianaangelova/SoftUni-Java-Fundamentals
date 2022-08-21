package Exercise;

import java.util.Scanner;

public class P07_StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        int explosionLeft = 0;
        for (int i = 0; i < data.length(); i++) {
            Character character = data.charAt(i);
            if (character == '>') {
                int explosion = Integer.parseInt(String.valueOf(data.charAt(i + 1)));
                 explosionLeft = explosion + explosionLeft;
                 int explosionAll=explosionLeft;
                for (int j = 0; j < explosionAll && (i + 1)<data.length(); j++) {
                    if (data.charAt(i + 1) != '>') {
                        data = data.substring(0, i + 1) + data.substring(i + 2, data.length());
                        explosionLeft = explosionLeft - 1;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(data);

    }
}
