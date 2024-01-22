package collectionIsNotCollections.map.hashMap;

import java.util.Objects;

public final class Student  implements Comparable<Student>{
    private final String name;
    private final String Surname;
    private final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        Surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(Surname, student.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Surname, course);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return Surname;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
        //return this.name.compareTo(o.name);
    }
}
