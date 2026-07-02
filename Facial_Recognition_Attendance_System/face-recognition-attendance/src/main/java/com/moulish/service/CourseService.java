package com.moulish.service;

import com.moulish.model.Course;
import com.moulish.repository.CourseRepository;

import java.util.List;

public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    //To Register a Course

    public void registerCourse(Course course) {

        if (courseRepository.courseExists(course.getCourseCode())) {
            throw new IllegalArgumentException(
                    "Course with code "
                            + course.getCourseCode()
                            + " already exists.");
        }

        courseRepository.addCourse(course);
    }

    //To Search for a Course

    public Course searchCourse(String courseCode) {

        Course course = courseRepository.findCourseByCode(courseCode);

        if (course == null) {
            throw new IllegalArgumentException(
                    "Course not found : " + courseCode);
        }

        return course;
    }

    //To Delete a Course

    public void deleteCourse(String courseCode) {

        if (!courseRepository.removeCourse(courseCode)) {
            throw new IllegalArgumentException(
                    "Course not found : " + courseCode);
        }
    }

    //To update the Course handling Faculty

    public void updateFaculty(String courseCode,
                              String facultyName) {

        Course course = searchCourse(courseCode);

        course.setFacultyName(facultyName);
    }

    //To update the ClassRoom Number

    public void updateClassroom(String courseCode,
                                String classroom) {

        Course course = searchCourse(courseCode);

        course.setClassroom(classroom);
    }

    //To display all the Courses

    public void displayAllCourses() {

        List<Course> courses =
                courseRepository.getAllCourses();

        if (courses.isEmpty()) {

            System.out.println("No Courses Available.");

            return;
        }

        for (Course course : courses) {

            System.out.println(course);

        }

    }

}