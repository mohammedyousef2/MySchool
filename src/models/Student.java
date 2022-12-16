package models;

public class Student extends Person {
    String parentPhoneNumber;

    public Student(String name, int age, String parentPhoneNumber) {
        super(name, age);
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public Student(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public Student() {
    }

    @Override
    public String getData() {
        return this.getName()+ " "+this.getAge()+" "+ this.parentPhoneNumber;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }
}
