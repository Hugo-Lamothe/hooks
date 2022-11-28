package main.java;


public class Main {
    public static void main(String[] args) {

        School mySchool = new School("Nathan's school");
        Professor p = new Professor("Valee", "Laure", Matiere.MATH);
        mySchool.addProf(p);
        Class c = new Class("T-01", p);
        Student s1 = new Student("Lamothe", "Hugo", c);
        Student s2 = new Student("Moussiron", "Nathan", c);
        mySchool.addStudent(s1);
        mySchool.addStudent(s2);
        mySchool.addClass(c);
        c.addStudent(s1);
        c.addStudent(s2);

        System.out.println("Dans l'école " + mySchool.name + " il y a la classe " + mySchool.classes.get(0).id +
                ". Dans cette classe, il y a " + c.students.size() + " élèves et leur professeur principale est : " +
                c.principale.prenom + " " + c.principale.nom + ".");
    }
}