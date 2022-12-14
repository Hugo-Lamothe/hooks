package main.java;

import java.util.ArrayList;

public class School {
    String name;
    public ArrayList <Professor> professors;
    public ArrayList <Student> students;
    public ArrayList <Class> classes;

    public School(String name){
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

    public void removeStudents(Student s){
        Boolean found = false;
        for(Student student : students){
            if(student == s){
                found = true;
            }
        }
        if(found)
            students.remove(s);
    }

    public void removeProf(Professor p){
        Boolean found = false;
        for(Professor prof : professors){
            if(prof.equals(p))
                found = true;
        }
        if(found)
            professors.remove(p);
    }
}
