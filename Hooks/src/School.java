import java.util.ArrayList;

public class School {
    String name;
    ArrayList <Professor> professors;
    ArrayList <Student> students;

    School(String name){
        this.name = name;
    }

    public void addProf(Professor p){
        professors.add(p);
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void removeStudents(){
        for (Student s : students) {
            students.remove(s);
        }
    }

    public void removeProf(){
        for (Professor p : professors) {
            professors.remove(p);
        }
    }
}
