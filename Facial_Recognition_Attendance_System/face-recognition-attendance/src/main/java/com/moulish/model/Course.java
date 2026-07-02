package com.moulish.model;

public class Course {

    private final String courseCode;
    private String courseName;
    private int credits;
    private int semester;
    private String facultyName;
    private String classroom;
    private String academicYear;

    public Course(String courseCode,
                  String courseName,
                  int credits,
                  int semester,
                  String facultyName,
                  String classroom,
                  String academicYear) {

        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.semester = semester;
        this.facultyName = facultyName;
        this.classroom = classroom;
        this.academicYear = academicYear;
    }

    // Getters

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public int getSemester() {
        return semester;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    // Setters

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "\n----------- COURSE DETAILS -----------\n" +
               "Course Code  : " + courseCode + "\n" +
               "Course Name  : " + courseName + "\n" +
               "Credits      : " + credits + "\n" +
               "Semester     : " + semester + "\n" +
               "Faculty Name : " + facultyName + "\n" +
               "Classroom    : " + classroom + "\n" +
               "Academic Year: " + academicYear + "\n" +
               "--------------------------------------";
    }
}