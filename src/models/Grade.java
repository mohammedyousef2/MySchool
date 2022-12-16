package models;

import java.util.ArrayList;

public class Grade {
    String code;
    String name;
    Teacher teacher;
    ArrayList<Student> students;

    public Grade(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }
}
