package com.deval.gestion.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor /*constructor vacío*/
@AllArgsConstructor /*constructor completo*/
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    private String position;
    private Double salary;

    @Builder.Default
    private Boolean active = true;
}