package P04_ProgrammingFundamentalsFinalExam;
import java.util.*;

public class P03_HeroesOfCodeAndLogicVII_02_FROM_INTERNET {
    public static class Hero {
        String name;
        int hitPoints;
        int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }

        public int castManaPoints(int manaPoints) {
            return this.manaPoints -= manaPoints;
        }

        public int increasesManaPoints(int manaPoints) {
            return this.manaPoints += manaPoints;
        }

        public int reducedHitPoints(int hitPoints) {
            return this.hitPoints -= hitPoints;
        }

        public int increasedHitPoint(int hp) {
            return this.hitPoints += hp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> heroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] token = scanner.nextLine().split("\\s+");//{hero name} {HP} {MP}
            String heroName = token[0];
            int hitPoints = Integer.parseInt(token[1]);
            int manaPoints = Integer.parseInt(token[2]);
            Hero h = new Hero(heroName, hitPoints, manaPoints);
            heroes.putIfAbsent(h.getName(), h);
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] token = command.split(" \\- ");
            switch (token[0]) {
                case "CastSpell":
                    String castHeroName = token[1];
                    int mp = Integer.parseInt(token[2]);
                    String spellName = token[3];
                    if (heroes.get(castHeroName).getManaPoints() >= mp) {
                        int castMp = heroes.get(castHeroName).castManaPoints(mp);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", castHeroName, spellName, castMp);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", castHeroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    String takeHeroName = token[1];
                    int damage = Integer.parseInt(token[2]);
                    String attacker = token[3];
                    int reducedHp = heroes.get(takeHeroName).reducedHitPoints(damage);
                    if (reducedHp > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", takeHeroName, damage, attacker, reducedHp);
                    } else {
                        heroes.remove(takeHeroName);
                        System.out.printf("%s has been killed by %s!%n", takeHeroName, attacker);
                    }
                    break;
                case "Recharge":
                    String rechargeHeroName = token[1];
                    int amount = Integer.parseInt(token[2]);

                    if (amount + heroes.get(rechargeHeroName).getManaPoints() > 200) {
                        int recoverMp = 200 - heroes.get(rechargeHeroName).getManaPoints();
                        heroes.get(rechargeHeroName).setManaPoints(200);
                        System.out.printf("%s recharged for %d MP!%n", rechargeHeroName, recoverMp);
                    } else {
                        int increasedMp = heroes.get(rechargeHeroName).increasesManaPoints(amount);
                        System.out.printf("%s recharged for %d MP!%n", rechargeHeroName, amount);
                    }
                    break;
                case "Heal":
                    String healHeroName = token[1];
                    int healAmount = Integer.parseInt(token[2]);
                    if (heroes.get(healHeroName).getHitPoints() + healAmount > 100) {
                        int recoverHp = 100 - heroes.get(healHeroName).getHitPoints();
                        heroes.get(healHeroName).setHitPoints(100);
                        System.out.printf("%s healed for %d HP!%n", healHeroName, recoverHp);
                    } else {
                        heroes.get(healHeroName).increasedHitPoint(healAmount);
                        System.out.printf("%s healed for %d HP!%n", healHeroName, healAmount);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        heroes.values().stream()

                .forEach(e -> System.out.println(String.format("%s%n  HP: %d%n  MP: %d", e.getName(), e.getHitPoints(), e.getManaPoints())));
    }
}
