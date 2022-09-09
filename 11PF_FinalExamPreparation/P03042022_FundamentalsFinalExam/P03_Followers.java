package P03042022_FundamentalsFinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class P03_Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> likeMap = new LinkedHashMap<>();
        Map<String, Integer> commentMap = new LinkedHashMap<>();
        while (!input.equals("Log out")) {
            List<String> inputList = Arrays.stream(input.split(": ")).collect(Collectors.toList());
            String command = inputList.get(0);
            String userName = inputList.get(1);

            switch (command) {
                case "New follower":
                    if (!likeMap.containsKey(userName)) {
                        likeMap.put(userName, 0);
                        commentMap.put(userName, 0);
                    }
                    break;
                case "Like":
                    int count = Integer.parseInt(inputList.get(2));
                    if (!likeMap.containsKey(userName)) {
                        likeMap.put(userName, count);
                        commentMap.put(userName, 0);
                    } else {
                        int currentLikes = likeMap.get(userName);
                        likeMap.replace(userName, currentLikes, currentLikes + count);
                    }
                    break;
                case "Comment":
                    if (!commentMap.containsKey(userName)) {
                        likeMap.put(userName, 0);
                        commentMap.put(userName, 1);
                    } else {
                        commentMap.replace(userName, commentMap.get(userName), commentMap.get(userName) + 1);
                    }
                    break;
                case "Blocked":
                    if (likeMap.containsKey(userName)) {
                        likeMap.remove(userName);

                        commentMap.remove(userName);
                    } else {
                        System.out.println(userName + " doesn't exist.");
                    }

                    break;
            }

            input = scanner.nextLine();
        }
        int count = 0;
        for (String m : likeMap.keySet()) {
            {
                count++;
            }
        }
        System.out.println(count + " followers");


        for (Map.Entry<String, Integer> l : likeMap.entrySet()) {
            for (Map.Entry<String, Integer> c : commentMap.entrySet()) {
                if (l.getKey().equals(c.getKey())) {
                    System.out.println(l.getKey() + ": " + (l.getValue() + c.getValue()));
                }
            }
        }

    }
}
