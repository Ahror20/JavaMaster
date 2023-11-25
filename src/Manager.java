import java.util.LinkedList;
import java.util.List;

public class Manager {
    private List<Student> students = new LinkedList<>();

    public void addStudent(String name,String surname,Integer age){
        Student student = new Student();
        students.add(student);
    }
}
