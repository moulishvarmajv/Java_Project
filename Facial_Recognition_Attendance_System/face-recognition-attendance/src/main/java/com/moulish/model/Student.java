package com.moulish.model;

public class Student {

    private final String rollNumber;
    private String firstName;
    private String lastName;
    private String email;
    private int semester;
    private String section;
    private String department;
    private String faceImagePath;

    public Student(String rollNumber,
                   String firstName,
                   String lastName,
                   String email,
                   int semester,
                   String section,
                   String department,
                   String faceImagePath) {

        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.semester = semester;
        this.section = section;
        this.department = department;
        this.faceImagePath = faceImagePath;
    }

    // Getters

    public String getRollNumber() {
        return rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getSemester() {
        return semester;
    }

    public String getSection() {
        return section;
    }

    public String getDepartment() {
        return department;
    }

    public String getFaceImagePath() {
        return faceImagePath;
    }

    // Setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFaceImagePath(String faceImagePath) {
        this.faceImagePath = faceImagePath;
    }

    @Override
    public String toString() {
        return "\n----------- STUDENT DETAILS -----------\n" +
               "Roll Number : " + rollNumber + "\n" +
               "First Name : " + firstName + "\n" +
               "Last Name  : " + lastName + "\n" +
               "Email      : " + email + "\n" +
               "Semester   : " + semester + "\n" +
               "Section    : " + section + "\n" +
               "Department : " + department + "\n" +
               "Face Image : " + faceImagePath + "\n" +
               "---------------------------------------";
    }
}