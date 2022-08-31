package P04_ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P03_HeroesOfCodeAndLogicVII {

    public static class Player {
        String playerName;
        int hitPoints;
        int manaPoints;

        public Player(String playerName, int hitPoints, int manaPoints) {
            this.playerName = playerName;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getPlayerName() {
            return playerName;
        }

        public void setPlayerName(String playerName) {
            this.playerName = playerName;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> playerList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

            String playerName = inputList.get(0);
            int hitPoints = Integer.parseInt(inputList.get(1));
            int manaPoints = Integer.parseInt(inputList.get(2));
            Player player = new Player(playerName, hitPoints, manaPoints);
            if (playerList.isEmpty()) {
                playerList.add(player);
            }
            for (Player p : playerList) {
                if (!p.getPlayerName().equals(playerName)) {
                    playerList.add(player);
                    break;
                }
            }

        }

        String data = scanner.nextLine();
        while (!data.equals("End")) {
            List<String> dataList = Arrays.stream(data.split("( \\- )")).collect(Collectors.toList());
            String command = dataList.get(0);
            String heroName = dataList.get(1);

            switch (command) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(dataList.get(2));
                    String spellName = dataList.get(3);
                    for (Player p : playerList) {
                        if (p.getPlayerName().equals(heroName)) {
                            if (p.getManaPoints() >= mpNeeded) {
                                p.setManaPoints(p.getManaPoints() - mpNeeded);
                                System.out.println(heroName + " has successfully cast " + spellName + " and now has " + p.getManaPoints() + " MP!");
                            } else {
                                System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                            }
                        }
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(dataList.get(2));
                    String attackerName = dataList.get(3);
                    for (Player p : playerList) {
                        if (p.getPlayerName().equals(heroName)) {
                            if (p.getHitPoints() > damage) {
                                p.setHitPoints(p.getHitPoints() - damage);
                                System.out.println(heroName + " was hit for " + damage + " HP by " + attackerName + " and now has " + p.getHitPoints() + " HP left!");
                            } else {
                                playerList.removeIf(pl -> pl.getPlayerName().equals(heroName));
                                System.out.println(heroName + " has been killed by " + attackerName + "!");
                                break;
                            }
                        }
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(dataList.get(2));
                    for (Player p : playerList) {
                        if (p.getPlayerName().equals(heroName)) {
                            int currentManaP = p.getManaPoints();
                            p.setManaPoints(p.getManaPoints() + amount);
                            if (p.getManaPoints() > 200) {
                                p.setManaPoints(200);
                            }
                            System.out.println(heroName + " recharged for " + (p.getManaPoints() - currentManaP) + " MP!");
                        }
                    }

                    break;
                case "Heal":
                    int amountHp = Integer.parseInt(dataList.get(2));
                    for (Player p : playerList) {
                        if (p.getPlayerName().equals(heroName)) {
                            int currentHP = p.getHitPoints();
                            p.setHitPoints(p.getHitPoints() + amountHp);
                            if (p.getHitPoints() > 100) {
                                p.setHitPoints(100);
                            }
                            System.out.println(heroName + " healed for " + (p.getHitPoints() - currentHP) + " HP!");
                        }
                    }
                    break;
            }
            data = scanner.nextLine();
        }

        for (Player p : playerList) {
            System.out.println(p.getPlayerName());
            System.out.println("  HP: " + p.getHitPoints());
            System.out.println("  MP: " + p.getManaPoints());
        }
    }
}
