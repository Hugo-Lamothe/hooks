package main.java;

public class Course {
    Matiere matiere;
    Professor professor;
    Class c;

    public Course(Matiere matiere, Professor professor, Class c) {
        this.matiere = matiere;
        this.professor = professor;
        this.c = c;
    }

    public void startCourse(){
        professor.startCourse();
    }

    public void endCourse(){
        professor.endCourse();
    }
}
