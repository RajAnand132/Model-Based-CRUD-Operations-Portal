package com.projectRaj.ModelBasedCRUDOperationsPortal.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "fk_course_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_student_id")
    )
    private Set<Student> students;
    /*
   @ManyToMany: This annotation marks the students field as representing a many-to-many relationship.
   It implies that a course can have multiple students, and a student can be enrolled in multiple courses.

    @JoinTable: This annotation is used to specify the join table that manages the many-to-many relationship
    between Course and Student entities. In a many-to-many relationship,
    a join table is required to store the associations between the two entities.

    name: Specifies the name of the join table in the database.
    In this case, it's named "student_course."

    joinColumns: This attribute indicates the foreign key columns in the join table that
    reference the owning side of the relationship, which is Course in this case.
    The name attribute specifies the name of the column that will store course IDs.

    inverseJoinColumns: This attribute indicates the foreign key columns in the join table
    that reference the non-owning side of the relationship, which is Student in this case.
    The name attribute specifies the name of the column that will store student IDs.

    With this configuration, JPA will automatically create the necessary join table "student_course"
    in the database to manage the many-to-many relationship. The join table will have
    two columns: "course_id" and "student_id," which establish the connections between courses and students.
    When you add a student to a course's students set, JPA will insert a record into this join table
    to represent the enrollment of the student in that course.
    */

}