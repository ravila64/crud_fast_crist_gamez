package entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="tbl_students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(name = "email_addess",unique = true,nullable = false)
    private String email;

}
