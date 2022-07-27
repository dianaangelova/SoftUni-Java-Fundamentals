package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    public static class Student {
        private String firstName;
        private String secondName;
        private String grade;


        public Student(String firstName, String secondName, String grade) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return this.firstName + " " + this.secondName + ": " + this.grade;
        }

        public String getGrade() {
            return grade;


        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Student> studentArr = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String input[] = scanner.nextLine().split(" ");
            String firstName = input[0];
            String secondName = input[1];
            String grade = input[2];

            Student student = new Student(firstName, secondName, grade);
            studentArr.add(student);
        }

        studentArr.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student s : studentArr) {
            System.out.println(s.toString());
        }

    }
}
