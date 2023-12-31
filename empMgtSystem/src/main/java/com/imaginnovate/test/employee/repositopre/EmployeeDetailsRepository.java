package com.imaginnovate.test.employee.repositopre;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.test.employee.model.Employee;

/**
 * @author Jwala
 *
 */
public interface EmployeeDetailsRepository extends JpaRepository<Employee, Long> {

}
