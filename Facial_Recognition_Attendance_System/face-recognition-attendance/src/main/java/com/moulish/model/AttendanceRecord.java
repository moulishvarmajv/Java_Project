package com.moulish.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class AttendanceRecord {

    private final Student student;
    private final Course course;

    private AttendanceStatus status;
    private LocalDate attendanceDate;
    private LocalTime attendanceTime;

    public AttendanceRecord(Student student,
                            Course course,
                            AttendanceStatus status,
                            LocalDate attendanceDate,
                            LocalTime attendanceTime) {

        this.student = student;
        this.course = course;
        this.status = status;
        this.attendanceDate = attendanceDate;
        this.attendanceTime = attendanceTime;
    }

    //Getter

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public AttendanceStatus getStatus() {
        return status;
    }

    public LocalDate getAttendanceDate() {
        return attendanceDate;
    }

    public LocalTime getAttendanceTime() {
        return attendanceTime;
    }

    //Setter

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }

    public void setAttendanceDate(LocalDate attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public void setAttendanceTime(LocalTime attendanceTime) {
        this.attendanceTime = attendanceTime;
    }

    @Override
    public String toString() {

        return "\n================ ATTENDANCE RECORD ================\n" +
                "Roll Number     : " + student.getRollNumber() + "\n" +
                "Student Name    : " + student.getFirstName() + " " + student.getLastName() + "\n" +
                "Course Code     : " + course.getCourseCode() + "\n" +
                "Course Name     : " + course.getCourseName() + "\n" +
                "Status          : " + status + "\n" +
                "Date            : " + attendanceDate + "\n" +
                "Time            : " + attendanceTime + "\n" +
                "===================================================\n";
    }
}