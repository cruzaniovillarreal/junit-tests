import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    private Student global;

//    @Before
//    public Student createNewStudentToTest() {
//        this.global = new Student(1, "Global Student");
//    }

    @Test
    public void testStudentConstructor() {
        Student newStudent = new Student(13, "Sam");
        assertNotNull(newStudent);
        Student max = null;
        assertNull(max);
        assertNotEquals(newStudent, new Student(13, "Sam"));
    }

    @Test
    public void testForIdRetrieval() {
        Student newStudent = new Student(19, "Fred");
        assertEquals(19, newStudent.getId());
    }

    @Test
    public void testForNameRetrieval() {
        Student newStudent = new Student(17, "Jack");
        assertEquals("Jack", newStudent.getName());
    }

    @Test
    public void testGradeAddition() {
        Student newStudent = new Student(20, "Alf");
        newStudent.addGrade(80);
//        int numAt0 = newStudent.getGrades().get(0);
        assertEquals(80, (int) newStudent.getGrades().get(0));
    }

    @Test
    public void testGradeArrays() {
        Student newStudent = new Student(6, "Louis");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.addGrade(100);
        ArrayList<Integer> ArrayExpected = new ArrayList<>();
        ArrayExpected.add(80);
        ArrayExpected.add(90);
        ArrayExpected.add(100);
        assertEquals(ArrayExpected, newStudent.getGrades());
    }

    @Test
    public void testAverage() {
        Student newStudent = new Student(6, "Louis");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        assertEquals(85, newStudent.getGradeAverage(), 0);
    }

    @Test
    public void testGradeUpdate() {
        Student newStudent = new Student(6, "Louis");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        assertEquals(90, (int) newStudent.getGrades().get(1));
        newStudent.updateGrade(1, 100);
        assertEquals(100, (int) newStudent.getGrades().get(1));
    }

    @Test
    public void deleteGrade() {
        Student newStudent = new Student(6, "Louis");
        newStudent.addGrade(80);
        newStudent.addGrade(90);
        newStudent.addGrade(100);
        newStudent.deleteGrade(90);
        ArrayList<Integer> ArrayExpected = new ArrayList<>();
        ArrayExpected.add(80);
        ArrayExpected.add(100);
        assertEquals(ArrayExpected, newStudent.getGrades());
    }
}
