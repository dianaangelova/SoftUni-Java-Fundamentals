package Exercise;

import java.util.Scanner;

public class P02_Articles {

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

        String input = scanner.nextLine();
        String[] inputArr = input.split(", ");
        String title = inputArr[0];
        String content = inputArr[1];
        String author = inputArr[2];

        Articles article = new Articles(title, content, author);
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            String[] commandArr = scanner.nextLine().split(": ");
            String command = commandArr[0];
            String newValue = commandArr[1];

            switch (command) {
                case "Edit":
                    article.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newValue);
                    break;
                case "Rename":
                    article.setTitle(newValue);
                    break;
            }
        }

        //System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
        System.out.println(article.toString());
    }
}
