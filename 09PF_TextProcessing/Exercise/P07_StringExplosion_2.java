package Exercise;

import javax.print.DocFlavor;
import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P07_StringExplosion_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != '>' && strength > 0) {
                sb.deleteCharAt(i);
                strength--;
                i--;
            } else if(sb.charAt(i) == '>'){
                strength+=Integer.parseInt(String.valueOf(sb.charAt(i + 1)));
        }

    }
        System.out.println(sb);
}

                }

