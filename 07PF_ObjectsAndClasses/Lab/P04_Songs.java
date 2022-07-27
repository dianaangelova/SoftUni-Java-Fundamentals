package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Songs {
    public static class Song {
        private String typeList;
        private String name;
        private String time;

        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // number of songs
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> listSongs = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            listSongs.add(song);
        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
            for (Song song : listSongs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : listSongs) {
                if (song.getTypeList().equals(typeList)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
