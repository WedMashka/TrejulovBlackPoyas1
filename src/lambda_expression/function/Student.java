package lambda_expression.function;

public class Student {
    String name;
    int old;
    int grade;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", grade=" + grade +
                '}';
    }

    public Student(String name, int old, int grade) {
        this.name = name;
        this.old = old;
        this.grade = grade;
    }

}
