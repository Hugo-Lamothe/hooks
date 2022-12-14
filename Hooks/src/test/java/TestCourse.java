package test.java;

import main.java.*;
import main.java.Class;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCourse {

    @Test
    public void testStartCourse(){
        Professor p = new Professor("Rodriguez", "Nicolas", Matiere.ANGLAIS);
        Class c = new Class("T-03", p);
        Course course = new Course(Matiere.ANGLAIS, p, c);
        assertTrue(p.dispo);
        course.startCourse();
        assertFalse(p.dispo);
        course.endCourse();
        assertTrue(p.dispo);
    }
}
