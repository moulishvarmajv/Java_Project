package com.moulish.service;

import java.time.LocalDate;
import java.util.List;

import com.moulish.model.AttendanceRecord;
import com.moulish.model.Course;
import com.moulish.model.Student;
import com.moulish.repository.AttendanceRepository;

public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    //Mark the Attendance

    public void markAttendance(AttendanceRecord record) {

        attendanceRepository.addAttendanceRecord(record);

    }

    //Get the Students Attendance

    public List<AttendanceRecord> getStudentAttendance(Student student) {

        return attendanceRepository.findAttendanceByStudent(student);

    }

    //Get the Course Attendance

    public List<AttendanceRecord> getCourseAttendance(Course course) {

        return attendanceRepository.findAttendanceByCourse(course);

    }

    //Get the Attendance of the present Date

    public List<AttendanceRecord> getAttendanceByDate(LocalDate date) {

        return attendanceRepository.findAttendanceByDate(date);

    }

    //To Display the Students Attendance Detail

    public void displayStudentAttendance(Student student) {

        List<AttendanceRecord> records =
                getStudentAttendance(student);

        if(records.isEmpty()) {

            System.out.println("No Attendance Records Found.");

            return;

        }

        for(AttendanceRecord record : records) {

            System.out.println(record);

        }

    }

    //To display the Course Attendance

    public void displayCourseAttendance(Course course) {

        List<AttendanceRecord> records =
                getCourseAttendance(course);

        if(records.isEmpty()) {

            System.out.println("No Attendance Records Found.");

            return;

        }

        for(AttendanceRecord record : records) {

            System.out.println(record);

        }

    }

}