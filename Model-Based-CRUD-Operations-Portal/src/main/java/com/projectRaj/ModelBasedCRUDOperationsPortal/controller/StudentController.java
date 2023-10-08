package com.projectRaj.ModelBasedCRUDOperationsPortal.controller;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Student;
import com.projectRaj.ModelBasedCRUDOperationsPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    // Create a new student
    @PostMapping("api/student")
    public String addStudent(@RequestBody Student student) {
        // Calls the service to create a new student
        return studentService.addStudent(student);
    }

    // Read a student by ID
    @GetMapping("api/student/{id}")
    public Object getStudentById(@PathVariable Long id) {
        // Calls the service to retrieve a student by ID
        return studentService.getStudentById(id);
    }

    // Update a student
    @PutMapping("api/student/id/{id}/studentDetails")
    public String updateStudent(@PathVariable Long id, @RequestBody Student student) {
        // Calls the service to update a student
        return studentService.updateStudent(id, student);
    }

    // Delete a student by ID
    @DeleteMapping("api/student/id/{id}")
    public String deleteStudentById(@PathVariable Long id) {
        // Calls the service to delete a student by ID
        return studentService.deleteStudentById(id);
    }

    // Get all students
    @GetMapping("api/students")
    public List<Student> getAllStudents() {
        // Calls the service to retrieve all students
        return studentService.getAllStudents();
    }
}
