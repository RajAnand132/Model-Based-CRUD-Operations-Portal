package com.projectRaj.ModelBasedCRUDOperationsPortal.repo;

import com.projectRaj.ModelBasedCRUDOperationsPortal.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
