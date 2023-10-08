package com.projectRaj.ModelBasedCRUDOperationsPortal.controller;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Course;
import com.projectRaj.ModelBasedCRUDOperationsPortal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping("api/course")
    public String createCourse(@RequestBody Course course) {
        // Calls the service to create a new course
        return courseService.createCourse(course);
    }

    // Read a course by ID
    @GetMapping("api/course/{id}")
    public Object getCourseById(@PathVariable Long id) {
        // Calls the service to retrieve a course by ID
        return courseService.getCourseById(id);
    }

    // Update a course
    @PutMapping("api/course/id/{id}/courseDetails")
    public String updateCourse(@PathVariable Long id, @RequestBody Course course) {
        // Calls the service to update a course
        return courseService.updateCourse(id, course);
    }

    // Delete a course by ID
    @DeleteMapping("api/course/id/{id}")
    public String deleteCourseById(@PathVariable Long id) {
        // Calls the service to delete a course by ID
        return courseService.deleteCourseById(id);
    }

    // Get all courses
    @GetMapping("api/courses")
    public List<Course> getAllCourses() {
        // Calls the service to retrieve all courses
        return courseService.getAllCourses();
    }
}
