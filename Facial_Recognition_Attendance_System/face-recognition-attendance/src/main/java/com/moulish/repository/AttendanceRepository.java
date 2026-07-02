package com.moulish.repository;

import com.moulish.model.AttendanceRecord;
import com.moulish.model.Course;
import com.moulish.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AttendanceRepository {

    private final List<AttendanceRecord> attendanceRecords;

    public AttendanceRepository() {
        attendanceRecords = new ArrayList<>();
    }

    //To Add a Attendance record

    public void addAttendanceRecord(AttendanceRecord record) {
        attendanceRecords.add(record);
    }

    //To Remove the Attendance Data

    public boolean removeAttendanceRecord(AttendanceRecord record) {

        if (!attendanceRecords.contains(record)) {
            return false;
        }

        attendanceRecords.remove(record);
        return true;
    }

    //To get all the recorded Attendace

    public List<AttendanceRecord> getAllAttendanceRecords() {
        return attendanceRecords;
    }

    //To Find Attendance by Student

    public List<AttendanceRecord> findAttendanceByStudent(Student student) {

        List<AttendanceRecord> records = new ArrayList<>();

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getStudent().getRollNumber()
                    .equalsIgnoreCase(student.getRollNumber())) {

                records.add(record);
            }

        }

        return records;
    }

    //To Find Attendance by Course

    public List<AttendanceRecord> findAttendanceByCourse(Course course) {

        List<AttendanceRecord> records = new ArrayList<>();

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getCourse().getCourseCode()
                    .equalsIgnoreCase(course.getCourseCode())) {

                records.add(record);
            }

        }

        return records;
    }

    //To Find the Attendance by Date

    public List<AttendanceRecord> findAttendanceByDate(LocalDate date) {

        List<AttendanceRecord> records = new ArrayList<>();

        for (AttendanceRecord record : attendanceRecords) {

            if (record.getAttendanceDate().equals(date)) {

                records.add(record);
            }

        }

        return records;
    }

    //To clear all the recorded Repositories

    public void clearAllRecords() {
        attendanceRecords.clear();
    }

}