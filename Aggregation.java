// Parent class
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Aggregation example - Student class
class Student {
    private Person person; // Aggregation - Student has a Person

    private String studentId;

    public Student(String name, int age, String studentId) {
        person = new Person(name, age);
        this.studentId = studentId;
    }

    public String getName() {
        return person.getName();
    }

    public int getAge() {
        return person.getAge();
    }

    public String getStudentId() {
        return studentId;
    }
}

// Main class
public class Aggregation {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 20, "S1234567");

        // Access the properties through aggregation
        String name = student.getName();
        int age = student.getAge();
        String studentId = student.getStudentId();

        // Print the details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentId);
    }
}
