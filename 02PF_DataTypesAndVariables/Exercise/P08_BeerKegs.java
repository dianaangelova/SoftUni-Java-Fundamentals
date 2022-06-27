package Exercise;

import java.util.Scanner;

public class P08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String model;
        double radius;
        int height;
        double volume;
        double maxvolume = 0;
        String maxModel = "";
        for (int i = 0; i < n; i++) {
            model = scanner.nextLine();
            radius = Double.parseDouble(scanner.nextLine());
            height = Integer.parseInt(scanner.nextLine());
            //π * r^2 * h.
            volume = Math.PI * Math.pow(radius, 2) + height;

            if (volume > maxvolume) {
                maxvolume = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);

    }
}
