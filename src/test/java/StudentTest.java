import org.junit.Test;
import static org.junit.Assert.*;

import java.java.Student;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testStudentConstructor() {
        Student newStudent = new Student("Sam", 13);
        assertEquals(newStudent, new Student("Sam", 13));
    }
}
