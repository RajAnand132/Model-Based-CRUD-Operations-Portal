package com.projectRaj.ModelBasedCRUDOperationsPortal.service;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Course;
import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Laptop;
import com.projectRaj.ModelBasedCRUDOperationsPortal.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    // Create a new course
    public String createCourse(Course course) {
        courseRepository.save(course);
        return "Course with name : "+course.getTitle()+" added into repository";
    }

    // Read a course by ID
    public Object getCourseById(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(optionalCourse.isPresent()){
            return optionalCourse;
        }
        return "Course with id :"+id+" not available to update";
    }

    // Update a course
    public String updateCourse(Long id, Course course) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(optionalCourse.isPresent()){
            courseRepository.save(course);
            return "Course with id :"+id+" updated";
        }
        return "Course with id :"+id+" not available to update";


    }

    // Delete a course by ID
    public String deleteCourseById(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if(optionalCourse.isPresent()){
            courseRepository.deleteById(id);
            return "Course with id :"+id+" deleted";
        }
        return "Course with id :"+id+" not available";
    }

    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

}