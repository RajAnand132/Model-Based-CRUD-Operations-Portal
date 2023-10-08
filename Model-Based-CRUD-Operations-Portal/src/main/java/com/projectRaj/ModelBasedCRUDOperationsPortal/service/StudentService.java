package com.projectRaj.ModelBasedCRUDOperationsPortal.service;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Laptop;
import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Student;
import com.projectRaj.ModelBasedCRUDOperationsPortal.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // Create a new student
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student with name :"+ student.getName()+" added in the repository";
    }

    // Read a student by ID
    public Object getStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            return optionalStudent;
        }
        return "Student with id "+id+" not available";
    }

    // Update a student
    public String updateStudent(Long id ,Student student) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            studentRepository.save(student);
            return "Student with id "+id+" updated";
        }
        return "Student with id "+id+" not available to update";

    }

    // Delete a student by ID
    public String deleteStudentById(Long id) {
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if(optionalStudent.isPresent()) {
            studentRepository.deleteById(id);
            return "Student with id "+id+" deleted";
        }
        return "Student with id "+id+" not available";
    }

    // Get all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}

