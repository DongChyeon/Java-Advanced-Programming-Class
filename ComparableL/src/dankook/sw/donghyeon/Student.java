package dankook.sw.donghyeon;

public class Student implements Comparable<Student> {
    String name;
    String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
    }
}
