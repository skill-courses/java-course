package inheritance;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 18);
        student.setStudentNumber(101);
        System.out.println(student.name);
        System.out.println(student.getStudentNumber());
    }
}
