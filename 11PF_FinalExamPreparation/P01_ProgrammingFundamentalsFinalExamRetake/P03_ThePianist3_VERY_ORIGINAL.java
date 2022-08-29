package P01_ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_ThePianist3_VERY_ORIGINAL {

    static class Piece{
        String pieceName;
        String composer;
        String key;

        public Piece(String pieceName, String composer, String key) {
            this.pieceName = pieceName;
            this.composer = composer;
            this.key = key;
        }

        public Piece(){}

        public String getPieceName() {
            return pieceName;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPieces =  Integer.parseInt(scanner.nextLine());

        Map<String,Piece> piecesInformation = new LinkedHashMap<>();
        for (int i = 0; i < numberOfPieces; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String pieceName = input[0];
            String composer = input[1];
            String key = input[2];

            //Piece piece = piecesInformation.get(pieceName);->ползваме го когато трябва да заменяме инфо при инициализация
            if (piecesInformation.get(pieceName) == null){
                piecesInformation.put(pieceName, new Piece(pieceName,composer, key));
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            String[] commands = input.split("\\|");
            String command = commands[0];

            if (command.equals("Add")){
                String pieceName = commands[1];
                String composer = commands[2];
                String key = commands[3];

                Piece piece = piecesInformation.get(pieceName);

                if (piece != null){
                    System.out.printf("%s is already in the collection!%n",pieceName);
                }else{
                    piecesInformation.put(pieceName,new Piece(pieceName,composer,key));
                    System.out.printf("%s by %s in %s added to the collection!%n",pieceName,composer,key);
                }


            }else if (command.equals("Remove")){
                String pieceName = commands[1];
                Piece piece = piecesInformation.get(pieceName);
                if (piece != null){
                    piecesInformation.remove(pieceName);
                    System.out.printf("Successfully removed %s!%n",pieceName);
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName);
                }

            }else if (command.equals("ChangeKey")){
                String pieceName = commands[1];
                String newKey = commands[2];
                Piece piece = piecesInformation.get(pieceName);

                if (piece != null){
                    piece.setKey(newKey);
                    System.out.printf("Changed the key of %s to %s!%n",piece.getPieceName(),piece.getKey());
                }else{
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n",pieceName);
                }

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Piece>entry: piecesInformation.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n",entry.getValue().getPieceName(), entry.getValue().getComposer(), entry.getValue().getKey());
        }

    }
}

