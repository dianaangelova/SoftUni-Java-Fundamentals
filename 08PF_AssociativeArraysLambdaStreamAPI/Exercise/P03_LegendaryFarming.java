package Exsercise;

import java.util.*;
import java.util.stream.Collectors;

public class P03_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       // List<String> inputList1 = Arrays.stream(scanner.nextLine().split("\\s+")).map(String::valueOf).collect(Collectors.toList());



        Map<String, Integer> keyMaterialsMap = new LinkedHashMap<>();
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        //"shards", "fragments", "motes"
        keyMaterialsMap.put("shards", 0);
        keyMaterialsMap.put("fragments", 0);
        keyMaterialsMap.put("motes", 0);

        while (keyMaterialsMap.get("shards") < 250 && keyMaterialsMap.get("fragments") < 250 && keyMaterialsMap.get("motes") < 250) {
            List<String> inputList = Arrays
                    .stream(scanner.nextLine()
                            .split("\\s+"))
                    .collect(Collectors.toList());
        for (int i = 0; i < inputList.size(); i = i + 2) {

                int quantity = Integer.parseInt(inputList.get(i));
                String material = inputList.get(i + 1);

                material = material.toLowerCase();
                if (keyMaterialsMap.containsKey(material)) {
                    keyMaterialsMap.put(material, quantity + keyMaterialsMap.get(material));
                } else {
                    if (junkMap.containsKey(material)) {
                        junkMap.put(material, quantity + junkMap.get(material));
                    } else {
                        junkMap.put(material, quantity);

                    }
                }
                if (keyMaterialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    break;
                } else if (keyMaterialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    break;
                } else if (keyMaterialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    break;
                }

            }
            //inputList = Arrays                    .stream(scanner.nextLine()                            .split("\\s+"))                    .collect(Collectors.toList());
       }
        if (keyMaterialsMap.get("shards") >= 250) {
             keyMaterialsMap.put("shards", keyMaterialsMap.get("shards") - 250);
        } else if (keyMaterialsMap.get("fragments") >= 250) {
            keyMaterialsMap.put("fragments", keyMaterialsMap.get("fragments") - 250);
        } else if (keyMaterialsMap.get("motes") >= 250) {
            keyMaterialsMap.put("motes", keyMaterialsMap.get("motes") - 250);
        }


        keyMaterialsMap.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));
        junkMap.forEach((key, value) -> System.out.printf("%s: %s%n", key, value));

    }
}
