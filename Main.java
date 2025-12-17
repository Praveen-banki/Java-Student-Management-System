import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        System.out.println("Enter student id:");
        int id = sc.nextInt();

        System.out.println("Enter student name:");
        String name = sc.next();

        System.out.println("Enter student marks:");
        int marks = sc.nextInt();

        Student s = new Student(id, name, marks);
        service.addStudent(s);

        System.out.println("Student Details:");
        service.displayStudents();

        sc.close();
    }
}
