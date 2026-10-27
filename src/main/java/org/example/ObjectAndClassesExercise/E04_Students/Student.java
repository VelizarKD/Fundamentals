package org.example.ObjectAndClassesExercise.E04_Students;

public class Student {

    private String firstName;
    private String secondName;
    private Double grade;

    public Student(String firstName, String secondName, Double grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getSecondName() {
        return secondName;
    }

    public Student setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public Double getGrade() {
        return grade;
    }

    public Student setGrade(Double grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public String toString(){
        return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
    }
}
