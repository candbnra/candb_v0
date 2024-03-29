package net.nra.candb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.nra.candb.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
