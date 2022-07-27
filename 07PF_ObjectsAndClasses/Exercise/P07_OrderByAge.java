package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P07_OrderByAge {

    public static class Person {
        String firstName;
        String id;
        int age;

        public Person(String firstName, String id, int age) {
            this.firstName = firstName;
            this.id = id;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return this.firstName + " with ID: " + this.id + " is " + this.age + " years old.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personArr = new ArrayList<>();

        while (!input.equals("End")) {
            String firstName = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new Person(firstName, id, age);
            personArr.add(person);
            input = scanner.nextLine();
        }

        personArr.sort(Comparator.comparing(Person::getAge));

        for (Person p : personArr) {
            System.out.println(p.toString());
        }
    }
}
