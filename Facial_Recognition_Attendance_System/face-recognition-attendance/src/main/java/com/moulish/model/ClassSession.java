package com.moulish.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClassSession {

    private final String sessionId;

    private Course course;

    private LocalDate sessionDate;

    private LocalTime startTime;

    private LocalTime endTime;

    private String classroom;

    public ClassSession(String sessionId,
                        Course course,
                        LocalDate sessionDate,
                        LocalTime startTime,
                        LocalTime endTime,
                        String classroom) {

        this.sessionId = sessionId;
        this.course = course;
        this.sessionDate = sessionDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.classroom = classroom;
    }

    //Getter

    public String getSessionId() {
        return sessionId;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getClassroom() {
        return classroom;
    }

    //Setter

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {

        return "\n=============== CLASS SESSION ===============\n" +
                "Session ID : " + sessionId + "\n" +
                "Course     : " + course.getCourseCode() + " - " + course.getCourseName() + "\n" +
                "Date       : " + sessionDate + "\n" +
                "Start Time : " + startTime + "\n" +
                "End Time   : " + endTime + "\n" +
                "Classroom  : " + classroom + "\n" +
                "=============================================\n";
    }
}