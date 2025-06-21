package week1.DesignPatternsAndPrinciples.MVCPattern;
public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Ruthvika", 101, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
    }
}
