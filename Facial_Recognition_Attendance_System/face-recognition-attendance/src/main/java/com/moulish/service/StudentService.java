package com.moulish.service;

import com.moulish.exception.StudentNotFoundException;
import com.moulish.model.Student;
import com.moulish.repository.StudentRepository;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    //When registering a Student detail

    public void registerStudent(Student student) {

        if (studentRepository.studentExists(student.getRollNumber())) {
            throw new IllegalArgumentException(
                    "Student with Roll Number "
                            + student.getRollNumber()
                            + " already exists.");
        }

        studentRepository.addStudent(student);
    }

    //When searching for a particular Student

    public Student searchStudent(String rollNumber)
            throws StudentNotFoundException {

        Student student =
                studentRepository.findStudentByRollNumber(rollNumber);

        if (student == null) {
            throw new StudentNotFoundException(
                    "Student not found : " + rollNumber);
        }

        return student;
    }

    //When deleting Student

    public void deleteStudent(String rollNumber)
            throws StudentNotFoundException {

        if (!studentRepository.removeStudent(rollNumber)) {

            throw new StudentNotFoundException(
                    "Student not found : " + rollNumber);

        }

    }

    //When updating EmailId

    public void updateStudentEmail(String rollNumber,
                                   String newEmail)
            throws StudentNotFoundException {

        Student student = searchStudent(rollNumber);

        student.setEmail(newEmail);
    }

    //when updating Department

    public void updateDepartment(String rollNumber,
                                 String department)
            throws StudentNotFoundException {

        Student student = searchStudent(rollNumber);

        student.setDepartment(department);
    }

    //Display all the Students

    public void displayAllStudents() {

        List<Student> students =
                studentRepository.getAllStudents();

        if (students.isEmpty()) {

            System.out.println("No Students Registered.");

            return;
        }

        for (Student student : students) {

            System.out.println(student);

        }

    }

}