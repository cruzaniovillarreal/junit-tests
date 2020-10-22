import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CohortTest {
    private Cohort cohort;

    @Before
    public void createStudent() {
        this.cohort = new Cohort();
    }

    @Test
    public void testStudentAddition() {
        assertEquals(0, this.cohort.getStudents().size());
        this.cohort.addStudent(new Student(1, "James"));
        assertEquals(1, this.cohort.getStudents().size());
    }

    @Test
    public void testGetStudents() {
        Student newGuy = new Student(1, "James");
        this.cohort.addStudent(newGuy);
        ArrayList<Student> ArrayExpected = new ArrayList<>();
        ArrayExpected.add(newGuy);
        assertEquals(ArrayExpected, this.cohort.getStudents());
    }

    @Test
    public void testAverage() {
        Student newGuy = new Student(1, "James");
        Student newGuy1 = new Student(2, "Jack");
        Student newGuy2 = new Student(3, "Jill");
        newGuy.addGrade(70);
        newGuy.addGrade(90);
        newGuy1.addGrade(60);
        newGuy1.addGrade(80);
        newGuy2.addGrade(80);
        newGuy2.addGrade(100);
        this.cohort.addStudent(newGuy);
        this.cohort.addStudent(newGuy);
        this.cohort.addStudent(newGuy);
        assertEquals(80, this.cohort.getCohortAverage(), 0);
    }

}
