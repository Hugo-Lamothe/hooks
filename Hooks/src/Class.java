import java.util.ArrayList;

public class Class {
    String id;
    ArrayList <Student> students;
    Professor principale;

    public Class(String id, Professor principale) {
        this.id = id;
        this.principale = principale;
        students = new ArrayList<>();
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudents(){
        for (Student s : students) {
            students.remove(s);
        }
    }
}
