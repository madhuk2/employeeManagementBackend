package employeemanagementsystem.employee.repository;

import employeemanagementsystem.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

@Query(value="Select * from employee where emp_name like %:empName%",nativeQuery = true)
    List<Employee> findAllByEmpName(String empName);

     Employee findByEmail(String email);
}
