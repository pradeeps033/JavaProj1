import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManage {
    private List<Student> students;
    private List<Courses> courses;

    public StudentManage() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Courses course) {
        courses.add(course);
    }

    public void displayStudents() {
        System.out.println("List of Students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayCourses() {
        System.out.println("List of Courses:");
        for (Courses course : courses) {
            System.out.println(course);
        }
    }

    public static void main(String[] args) {
        StudentManage system = new StudentManage();
        Scanner scanner = new Scanner(System.in);

        // Adding a sample student and course
        system.addStudent(new Student("1", "HP", 20));
        system.addCourse(new Courses("C1", "NewCpurse"));

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.displayStudents();
                    break;
                case 2:
                    system.displayCourses();
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
