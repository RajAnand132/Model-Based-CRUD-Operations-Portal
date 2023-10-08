package com.projectRaj.ModelBasedCRUDOperationsPortal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    @OneToOne()
    @JoinColumn(name = "fk_address_id")
    private Address address;
    /*
    @OneToOne: This annotation signifies a one-to-one relationship between
    the Student entity and the Address entity. In this context:

    Each Student instance is associated with exactly one Address, and each Address can
    be associated with at most one Student. This implies a strict one-to-one correspondence.

    @JoinColumn(name = "fk_address_id"): This annotation is used to specify the foreign key column
    that links the Student entity to the Address entity in the database schema.

    name: Specifies the name of the foreign key column in the Student table.
    In this case, it's named "fk_address_id."

    This setup ensures that each student is associated with one specific address,
    and the relationship is enforced at the database level through the foreign key constraint.
     */

    @OneToMany(mappedBy = "students")
    private Set<Course> courses;

    /*
    @OneToMany: This annotation signifies a one-to-many relationship between
    the Student entity and the Course entity. In this context:

    Each Student instance can be associated with multiple Course instances.
    This implies that one student can be enrolled in multiple courses.

    mappedBy = "students": This attribute specifies the name of the field in the Course entity
    that "owns" the relationship. In this case, it indicates that the Course entity has a
    field named "students" that maps back to the Student entity's one-to-many relationship.
    This is often used in bidirectional relationships to specify the owning side of the relationship.

    With this setup, you can access the courses associated with a student using the courses field
    in the Student entity. Each course in the Set<Course> will correspond to a course that
    the student is enrolled in.
     */

}
