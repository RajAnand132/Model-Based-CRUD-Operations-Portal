package com.projectRaj.ModelBasedCRUDOperationsPortal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    /*
    @ManyToOne: This annotation signifies a many-to-one relationship between
    the Book entity and the Student entity. In this context:

    Many Book instances can be associated with one Student.
    This implies that multiple books can be linked to a single student.

    It also implies that a Book entity has a foreign key that references a Student.
    The foreign key is typically created in the database schema to establish this association.

    The Book class, as defined here, will typically have a foreign key column in its corresponding
    database table that refers to the primary key (ID) of a Student entity. This foreign key establishes
    the link between a book and the student who owns or is associated with that book.

    */

    
}