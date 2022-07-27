package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P04_Articles2 {

    static class Articles {
        String title;
        String content;
        String author;

        public Articles(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Articles> articlesList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            String[] dataArr = scanner.nextLine().split(", ");
            String title = dataArr[0];
            String content = dataArr[1];
            String author = dataArr[2];

            Articles article = new Articles(title, content, author);
            articlesList.add(article);
        }

        String sortText = scanner.nextLine();
/*

        for(int i=0; i< articlesList.size(); i++) {
            if (sortText.equals("title")) {
                articlesList.sort(Comparator.comparing(Articles::getTitle));
            } else if (sortText.equals("author")) {
                articlesList.sort(Comparator.comparing(Articles::getAuthor));
            } else if (sortText.equals("content")) {
                articlesList.sort(Comparator.comparing(Articles::getContent));
            }
            System.out.println(articlesList.get(i).toString());
        };

*/
        for (int i = 0; i < articlesList.size(); i++) {
            System.out.println(articlesList.get(i));
        }
    }
}
