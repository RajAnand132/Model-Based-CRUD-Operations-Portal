package com.projectRaj.ModelBasedCRUDOperationsPortal.repo;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
