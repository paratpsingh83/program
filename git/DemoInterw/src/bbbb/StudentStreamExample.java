package bbbb;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentStreamExample {
    
    static class Student {
        private int id;
        private String name;
        private int age;
        private String gender;         //// ye sab feield hai bata de

        public Student(int id, String name, int age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;                  //// ye constracter hai
            this.gender = gender;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Student{id=" + id + ", name='" + name + "', age=" + age + ", gender='" + gender + "'}";
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Alice", 12, "Female"),
            new Student(2, "Bob", 9, "Male"),
            new Student(3, "Charlie", 11, "Male"),
            new Student(4, "Diana", 15, "Female"),
            new Student(5, "Eve", 10, "Female"),
            new Student(6, "Frank", 14, "Male")
        );

        // 1. Students with even ID numbers
        List<Student> evenIdStudents = students.stream()
            .filter(student -> student.getId() % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Students with even IDs: " + evenIdStudents);// ye mat likhna

        // 2. Number of female students with age > 10
        long femaleStudentsAbove10 = students.stream()
            .filter(student -> student.getGender()
                    .equalsIgnoreCase("Female") && student.getAge() > 10)
                    .count();

        System.out.println("Number of female students age > 10: " + femaleStudentsAbove10);

        // 3. Names in alphabetical order
        List<String> sortedNames = students.stream()
            .map(Student::getName)
            .sorted()
            .collect(Collectors.toList());
        System.out.println("Names in alphabetical order: " + sortedNames);



        // Get names of students with even ID numbers
        List<String> evenIdStudentNames = students.stream()
                .filter(student -> student.getId() % 2 == 0)
                .map(Student::getName)  // Map to names
                .collect(Collectors.toList());
    }
}
