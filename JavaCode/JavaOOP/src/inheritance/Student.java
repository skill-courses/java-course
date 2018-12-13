package inheritance;

public class Student extends Person {
    
    private int studentNumber;
    
    public Student(String name, int age) {
        super(name, age);
    }
    
    public int getStudentNumber() {
        return studentNumber;
    }
    
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
