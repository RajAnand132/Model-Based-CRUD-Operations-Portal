package com.projectRaj.ModelBasedCRUDOperationsPortal.repo;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
