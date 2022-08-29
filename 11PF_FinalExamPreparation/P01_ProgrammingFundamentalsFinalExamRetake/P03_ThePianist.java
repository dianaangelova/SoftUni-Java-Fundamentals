package P01_ProgrammingFundamentalsFinalExamRetake;

import javax.security.sasl.SaslClient;
import java.util.*;
import java.util.stream.Collectors;

public class P03_ThePianist {
    static class Piece {
        String name;
        String composer;
        String key;

        public String getName() {
            return name;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public Piece(String name, String composer, String key) {
            this.name = name;
            this.composer = composer;
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Piece> pieceArr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            Piece pieceItem = new Piece(data[0], data[1], data[2]);
            pieceArr.add(pieceItem);
            //pieceItem.setName(data[0]);
            //pieceItem.setComposer(data[1]);
            //pieceItem.setKey(data[2]);
        }
        String input = scanner.nextLine();
        List<String> toRemoveArr = new ArrayList<>();

        while (!input.equals("Stop")) {
            List<String> stringList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
            String command = stringList.get(0);

            if (command.equals("Add")) {
                String name = stringList.get(1);
                String composer = stringList.get(2);
                String key = stringList.get(3);
                Piece pieceItem = new Piece(name, composer, key);
                for (Piece p : pieceArr) {
                    if (p.getName().equals(name)) {
                        System.out.println(name + " is already in the collection!");
                    } else {
                        pieceArr.add(pieceItem);
                        System.out.println(name + " by " + composer + " in " + key + " added to the collection!");
                    }
                    break;
                }
            } else if (command.equals("Remove")) {
                String name = stringList.get(1);
                List<String> nameArr = new ArrayList<>();
                for (Piece p : pieceArr) {
                    nameArr.add(p.getName());
                }
                if (!nameArr.contains(name)) {
                    System.out.println("Invalid operation! " + name + " does not exist in the collection.");
                } else {
                    System.out.println("Successfully removed " + name + "!");
                    toRemoveArr.add(name);
                }

                //
            } else if (command.equals("ChangeAll")) {
            }
            input = scanner.nextLine();
        }


        for (Piece p : pieceArr) {
            System.out.println(p.getName() + " -> Composer: " + p.getComposer() + ", Key: " + p.getKey());
        }
    }
    {
    }
}

