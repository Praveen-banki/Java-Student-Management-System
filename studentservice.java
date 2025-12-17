import java.util.ArrayList;

class StudentService {
    ArrayList<Student> list = new ArrayList<>();

    void addStudent(Student s) {
        list.add(s);
    }

    void displayStudents() {
        for (Student s : list) {
            System.out.println(
                "ID: " + s.id +
                ", Name: " + s.name +
                ", Marks: " + s.marks
            );
        }
    }
}
