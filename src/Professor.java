public class Professor {

    private String name;
    private String surname;
    private Integer age;
    private Double salary;

    public Professor(String name, String surname, Integer age, Double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
}
