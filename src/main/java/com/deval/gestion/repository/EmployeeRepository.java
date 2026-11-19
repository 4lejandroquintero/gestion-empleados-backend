package com.deval.gestion.repository;

import com.deval.gestion.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Método personalizado para buscar por email (Spring JPA genera el SQL solo por el nombre del método)
    Optional<Employee> findByEmail(String email);

    // Método personalizado para traer solo los empleados activos
    List<Employee> findByActiveTrue();
}