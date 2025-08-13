package com.anmol.springboot.cruddemo.dao;

import com.anmol.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // that's it ... no need to write any code
    // Entity - Employee ... Primary Key - Integer
    // get these methods - findAll(), findById(), save(), deleteById()...
}
