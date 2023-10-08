package com.projectRaj.ModelBasedCRUDOperationsPortal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private Integer price;

    @OneToOne()
    @JoinColumn(name = "fk_student_id")
    private Student student;

    /*
    @OneToOne: This annotation signifies a one-to-one relationship between
    the Laptop entity and the Student entity. In this context:

    Each Laptop instance is associated with exactly one Student,
    and each Student can be associated with exactly one Laptop.
    This implies a strict one-to-one correspondence.

    @JoinColumn(name = "fk_student"): This annotation is used to specify the foreign key column that
    links the Laptop entity to the Student entity in the database schema.

    name: Specifies the name of the foreign key column in the Laptop table. In this case,
    it's named "fk_student."

     the @OneToOne annotation with @JoinColumn in the Laptop class indicates a one-to-one relationship
     between laptops and students, where each laptop is associated with one specific student,
     and each student can have at most one laptop. This is a way to represent such relationships
     in a relational database using JPA.
     */
}
