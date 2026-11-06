class Person {
    String name;
    String dateOfBirth;

    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
}

class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String dateOfBirth,
            double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }
}

class Student extends Person {
    String course;

    Student(String name, String dateOfBirth, String course) {
        super(name, dateOfBirth);
        this.course = course;
    }
}

class CollegeStudent extends Student {
    int year;

    CollegeStudent(String name, String dateOfBirth,
                   String course, int year) {
        super(name, dateOfBirth, course);
        this.year = year;
    }
}

public class SchoolApplication {
    public static void main(String[] args) {

        Teacher t = new Teacher(
            "Rahul", "12-05-1985", 50000, "Java"
        );

        CollegeStudent cs = new CollegeStudent(
            "Amit", "15-08-2005", "CSE", 3
        );

        System.out.println("Teacher Details:");
        System.out.println("Name: " + t.name);
        System.out.println("Date of Birth: " + t.dateOfBirth);
        System.out.println("Salary: " + t.salary);
        System.out.println("Subject: " + t.subject);

        System.out.println("\nCollege Student Details:");
        System.out.println("Name: " + cs.name);
        System.out.println("Date of Birth: " + cs.dateOfBirth);
        System.out.println("Course: " + cs.course);
        System.out.println("Year: " + cs.year);
    }
}