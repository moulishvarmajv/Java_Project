package com.moulish.repository;

import com.moulish.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students;

    public StudentRepository() {
        students = new ArrayList<>();
    }

    //To add a Student

    public void addStudent(Student student) {
        students.add(student);
    }

    //To remove a Student

    public boolean removeStudent(String rollNumber) {

        Student student = findStudentByRollNumber(rollNumber);

        if (student == null) {
            return false;
        }

        students.remove(student);
        return true;
    }

    //To find a particular Student

    public Student findStudentByRollNumber(String rollNumber) {

        for (Student student : students) {

            if (student.getRollNumber().equalsIgnoreCase(rollNumber)) {
                return student;
            }

        }

        return null;
    }

    //To get all the students

    public List<Student> getAllStudents() {
        return students;
    }

    //If he/she Exsist

    public boolean studentExists(String rollNumber) {

        return findStudentByRollNumber(rollNumber) != null;

    }

}