package models;

import java.util.ArrayList;

public class School {
    String name;
    String address;
    String phoneNumber;
    ArrayList<Student> students;
    ArrayList<Teacher> teachers;
    ArrayList<Grade> grades;

    public School() {
        this.initObject();
    }
    public School(String name) {
        this.name = name;
        this.initObject();
    }
    private void initObject(){
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
        this.grades =   new ArrayList<Grade>();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }
}
