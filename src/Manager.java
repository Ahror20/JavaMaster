import java.util.LinkedList;
import java.util.List;

public class Manager {
    private List<Student> students = new LinkedList<>();

    private List<Professor> professors = new LinkedList<>();
    public void addStudent(String name,String surname,Integer age){
        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        students.add(student);
    }
    public Student getStudent(String name){
        int index=0;
        for (Student student:students){
            if (student!=null ) {
                index++;
                if (student.getName().equals(name)) {
                    return students.get(index);
                }
            }
        }
        return null;
    }

    public void addProfessor(String name,String surname,Integer age,Double salary){
        Professor professor = new Professor(name,surname,age,salary);
        professors.add(professor);
    }
}
