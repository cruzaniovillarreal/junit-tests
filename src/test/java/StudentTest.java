import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class StudentTest {
    private Student global;

    @Before
    public void createStudent() {
        this.global = new Student(1L, "fer");
    }

    @Test
    public void testCreateStudent(){
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(this.global);
    }

    @Test
    public void testStudentFields(){
        assertSame(1L, this.global.getId());
        assertSame("fer", this.global.getName());
        assertSame(0, this.global.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        this.global.addGrade(100);
        assertSame(100, this.global.getGrades().get(0));
        this.global.addGrade(80);
        assertSame(80, this.global.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        this.global.addGrade(100);
        this.global.addGrade(80);
        assertEquals(90, this.global.getGradeAverage(), 0);
    }
}