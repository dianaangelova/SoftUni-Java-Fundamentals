package P02_ProgrammingFundamentalsFinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class P03_PlantDiscovery2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantMap = new LinkedHashMap<>();
        Map<String, List<Double>> ratingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            List<String> plantList = Arrays.stream(scanner.nextLine().split("\\<\\-\\>")).collect(Collectors.toList());
            if (plantMap.containsKey(plantList.get(0))) {
                plantMap.replace(plantList.get(0), plantMap.get(plantList.get(0)), Integer.parseInt(plantList.get(1)));
            } else {
                plantMap.put(plantList.get(0), Integer.parseInt(plantList.get(1)));
            }
        }
        String data = scanner.nextLine();

        while (!data.equals("Exhibition")) {
            List<String> stringList = Arrays.stream(data.split(":")).collect(Collectors.toList());
            String command = stringList.get(0);
            int countRatings = 0;
            double avgRatings = 0.0;
            if (command.equals("Rate")) {
                String dataToSubstr = stringList.get(1);
                dataToSubstr = dataToSubstr.substring(1).trim();
                String[] dataToSubstrArr = dataToSubstr.split("\\s+\\-\\s+");
                String plantName = dataToSubstrArr[0];
                Double rate = Double.parseDouble(dataToSubstrArr[1]);

                if (plantMap.containsKey(plantName)) {
                    if (!ratingMap.containsKey(plantName)) {
                        ratingMap.put(plantName, new ArrayList());
                        //Double.parseDouble(dataToSubstrArr[1])
                        //data.get(key).add(p.getSalary)
                        ratingMap.get(plantName).add(rate);
                    } else if (ratingMap.containsKey(plantName)) {
                        for (Map.Entry<String, List<Double>> ld : ratingMap.entrySet()) {
                            if (ld.getKey().equals(plantName)) {
                                ratingMap.get(plantName).add(rate);
                            }
                        }
                    }
                } else System.out.println("error");
            } else if (command.equals("Update")) {
                String dataToSubstr = stringList.get(1);
                dataToSubstr = dataToSubstr.substring(1).trim();
                String[] dataToSubstrArr = dataToSubstr.split("\\s+\\-\\s+");
                if (plantMap.containsKey(dataToSubstrArr[0])) {
                    plantMap.replace(dataToSubstrArr[0], plantMap.get(dataToSubstrArr[0]), Integer.parseInt(dataToSubstrArr[1]));
                } else System.out.println("error");
            } else if (command.equals("Reset")) {
                String dataToSubstr = stringList.get(1);
                dataToSubstr = dataToSubstr.substring(1).trim();
                if (plantMap.containsKey(dataToSubstr)) {
                    ratingMap.remove(dataToSubstr);
                } else System.out.println("error");
            }
            data = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> m : plantMap.entrySet()) {
            if (!ratingMap.containsKey(m.getKey())) {
                ratingMap.put(m.getKey(), Collections.singletonList(0.00));
            }
        }
        Double averageRatings = 0.00;
        Double sumRatings = 0.00;
        int countR = 0;

        for (Map.Entry<String, Integer> m : plantMap.entrySet()) {
            for (Map.Entry<String, List<Double>> r : ratingMap.entrySet()) {
                if (m.getKey().equals(r.getKey())) {
                    for (Double d : r.getValue()) {
                        countR++;
                        sumRatings = sumRatings + d;
                    }
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", m.getKey(), m.getValue(), sumRatings / countR);
                    countR = 0;
                    sumRatings =0.0;
                }
            }
        }
    }
}
