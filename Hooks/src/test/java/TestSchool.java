package test.java;

import main.java.Class;
import main.java.Matiere;
import main.java.Professor;
import main.java.School;
import main.java.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestSchool {

    @Test
    public void testAddRemoveProf(){
        School s = new School("mySchool");
        assertEquals(s.professors.size(), 0);
        Professor p = new Professor("Richard", "Jules", Matiere.HISTOIRE);
        s.addProf(p);
        assertEquals(s.professors.size(), 1);
        s.removeProf(p);
        assertEquals(s.professors.size(), 0);
    }

    @Test
    public void testAddRemoveStudent(){
        School s = new School("mySchool");
        assertEquals(s.students.size(), 0);
        Professor p = new Professor("Mesmes", "Martin", Matiere.FRANCAIS);
        Class c = new Class("T-02", p);
        Student student = new Student("Colin", "Antoine", c);
        s.addStudent(student);
        assertEquals(s.students.size(), 1);
        s.removeStudents(student);
        assertEquals(s.students.size(), 0);
    }
}
