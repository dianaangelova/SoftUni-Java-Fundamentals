package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Students_2 {
    static class Student {
        private String firstName;
        private String secondName;
        private int age;
        private String city;

        public Student(String firstName, String secondName, int age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setSecondName(String secondName) {
            this.secondName = secondName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }

        private static boolean IsStudentExisting(List<Student> students, String firstName, String secondName) {
            for (Student student : students) {
                if (student.getFirstName().equals(firstName) && student.getSecondName().equals(secondName)) {
                    return true;
                }
            }
            return false;

        }

        private static Student findStudent(List<Student> studentList, String firstName, String secondName) {
            for (int i = 0; i < studentList.size(); i++) {
                Student s = studentList.get(i);
                if (s.getFirstName().equals(firstName) && s.getSecondName().equals(secondName)) {
                    return s;
                }
            }
            return null;
        }
    }

    public static String printStudent(String firstName, String secondName, int age) {
        String result;
        return "this.firstName" + " " + "this.secondName" + " is " + "this.age" + " years old ";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] dataArr = input.split("\\s+");
            String firstName = dataArr[0];
            String secondName = dataArr[1];
            int age = Integer.parseInt(dataArr[2]);
            String city = dataArr[3];

            Student existing = Student.findStudent(studentList, firstName, secondName);
            if (existing == null) {
                Student student = new Student(firstName, secondName, age, city);
                studentList.add(student);

            } else {
                existing.setAge(age);
                existing.setCity(city);
            }


            input = scanner.nextLine();

        }
        String cityCompare = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getCity().equals(cityCompare)) {
                System.out.printf("%s %s is %d years old", s.getFirstName(), s.getSecondName(), s.getAge());
                System.out.println();
            }
        }


    }


}
