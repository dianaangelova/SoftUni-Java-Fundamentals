package Exercise;

import java.util.Random;
import java.util.Scanner;

public class P01_AdvertisementMessage {


    //  public static String printAdvertisement(String phrase, String event, String author, String city) {
    //       String result;
    //     result = "phrase" + " " + "event" + " " + "author" + " – " + "city" + ".";
    //      return result;
    //  }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrasesArr = ("Excellent product., Such a great product., I always use that product., Best product of its category., Exceptional product., I can’t live without this product.").split("\\, ");
        String[] eventsArr = ("Now I feel good.; I have succeeded with this product.; Makes miracles. I am happy of the results!; I cannot believe but now I feel awesome.; Try it yourself, I am very satisfied.; I feel great!").split("\\; ");
        String[] authorsArr = ("Diana, Petya, Stella, Elena, Katya, Iva, Annie, Eva").split("\\, ");
        String[] citiesArr = ("Burgas, Sofia, Plovdiv, Varna, Ruse").split("\\, ");

        int numberMessages = Integer.parseInt(scanner.nextLine());
        Random rdm = new Random();

        for (int pos1 = 0; pos1 < phrasesArr.length; pos1++) {
            int pos2 = rdm.nextInt(phrasesArr.length);
            String temp;
            temp = phrasesArr[pos1];
            phrasesArr[pos1] = phrasesArr[pos2];
            phrasesArr[pos2] = temp;

        }
        for (int pos1 = 0; pos1 < eventsArr.length; pos1++) {
            int pos2 = rdm.nextInt(eventsArr.length);
            String temp;
            temp = eventsArr[pos1];
            eventsArr[pos1] = eventsArr[pos2];
            eventsArr[pos2] = temp;

        }

        for (int pos1 = 0; pos1 < authorsArr.length; pos1++) {
            int pos2 = rdm.nextInt(authorsArr.length);
            String temp;
            temp = authorsArr[pos1];
            authorsArr[pos1] = authorsArr[pos2];
            authorsArr[pos2] = temp;

        }

        for (int pos1 = 0; pos1 < citiesArr.length; pos1++) {
            int pos2 = rdm.nextInt(citiesArr.length);
            String temp;
            temp = citiesArr[pos1];
            citiesArr[pos1] = citiesArr[pos2];
            citiesArr[pos2] = temp;

        }


        for (int i = 0; i < numberMessages; i++) {
            System.out.println(phrasesArr[i] + " " + eventsArr[i] + " " + authorsArr[i] + " – " + citiesArr[i] + ".");
        }
    }
}
