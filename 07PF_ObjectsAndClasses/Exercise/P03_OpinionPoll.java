package Exercise;

import java.util.*;

public class P03_OpinionPoll {

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return this.age;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Person> personArr = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);
            personArr.add(person);

        }


        List<String> result = new ArrayList<>();

        for (Person p : personArr) {
            if (p.getAge() > 30) {
                result.add(p.toString());
            }
        }

        //Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
