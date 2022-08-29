package P01_ProgrammingFundamentalsFinalExamRetake;

import java.util.*;
import java.util.stream.Collectors;

public class P03_ThePianist2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> nameList = new ArrayList<>();
        List<String> composerList = new ArrayList<>();
        List<String> keyList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\|");
            nameList.add(data[0]);
            composerList.add(data[1]);
            keyList.add(data[2]);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            List<String> inputList = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
            String command = inputList.get(0);

            if (command.equals("Add")) {
                String name = inputList.get(1);
                String composer = inputList.get(2);
                String key = inputList.get(3);
                if (nameList.contains(name)) {
                    System.out.println(name + " is already in the collection!");
                } else {
                    nameList.add(name);
                    composerList.add(composer);
                    keyList.add(key);
                    System.out.println(name + " by " + composer + " in " + key + " added to the collection!");
                }
            } else if (command.equals("Remove")) {
                String name = inputList.get(1);
                if (nameList.contains(name)) {
                    int toRemove = nameList.indexOf(name);
                    nameList.remove(name);
                    composerList.remove(toRemove);
                    keyList.remove(toRemove);
                    System.out.println("Successfully removed " + name + "!");
                } else {
                    System.out.println("Invalid operation! " + name + " does not exist in the collection.");
                }
            } else if (command.equals("ChangeKey")){
                String name = inputList.get(1);
                String newName = inputList.get(2);
                if(nameList.contains(name)){
                    int index = nameList.indexOf(name);
                    keyList.set(index, newName);
                    System.out.println("Changed the key of "+name+" to "+newName+"!");
                }  else {
                    System.out.println("Invalid operation! " + name + " does not exist in the collection.");
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", nameList.get(i), composerList.get(i), keyList.get(i));
        }
    }
}
