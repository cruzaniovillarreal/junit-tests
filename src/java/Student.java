import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades;
    private long id;
    private String name;


    public Student(long id, String name) {
        this.name = name;
        this.id=id;
        this.grades = new ArrayList<>();
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int total = 0;
        for (int grade : this.grades) {
            total = total + grade;
        }
        return total / this.grades.size();
    }

    public void updateGrade(int element, int newGrade) {
        this.grades.set(element, newGrade);
    }

    public void deleteGrade(int grade) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int grades : this.grades) {
            if(grades != grade) {
                newList.add(grades);
            }
        }
        this.grades = newList;
    }

}
