package hu.unideb.inf.bootstrap_k10_2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name = "persons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    @Id
    @GeneratedValue
    Integer id;
    String firstName;
    String lastName;
    String email;
    String password;
    boolean enabled;
}
