package Exercise;

import java.util.Scanner;

public class P03_ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int lastIndexBar = input.lastIndexOf("\\");
        String file = input.substring(lastIndexBar + 1);
        int lastIndexPoint = file.lastIndexOf(".");
        String fileName = file.substring(0, lastIndexPoint);
        String fileExtent = file.substring(lastIndexPoint + 1);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtent);
    }
}
