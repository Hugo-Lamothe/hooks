import java.util.ArrayList;

public class School {
    String name;
    ArrayList <Professor> professors;
    ArrayList <Student> students;
    ArrayList <Class> classes;

    School(String name){
        this.name = name;
        professors = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addProf(Professor p){
        professors.add(p);
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void addClass(Class c){
        classes.add(c);
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
