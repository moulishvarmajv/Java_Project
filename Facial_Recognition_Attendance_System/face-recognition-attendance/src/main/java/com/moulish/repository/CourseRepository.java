package com.moulish.repository;

import com.moulish.model.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseRepository {

    private final List<Course> courses;

    public CourseRepository() {
        courses = new ArrayList<>();
    }

    //To Add a particular Course

    public void addCourse(Course course) {
        courses.add(course);
    }

    //To Remove a particular Course

    public boolean removeCourse(String courseCode) {

        Course course = findCourseByCode(courseCode);

        if (course == null) {
            return false;
        }

        courses.remove(course);
        return true;
    }

    //To Find a particular Course

    public Course findCourseByCode(String courseCode) {

        for (Course course : courses) {

            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }

        }

        return null;
    }

    //To get all the courses

    public List<Course> getAllCourses() {
        return courses;
    }

    //Check whether the particular course Exsist or not

    public boolean courseExists(String courseCode) {

        return findCourseByCode(courseCode) != null;

    }

}