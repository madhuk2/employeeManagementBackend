package employeemanagementsystem.employee.service;

import employeemanagementsystem.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
        void  addOrUpdateEmployee(Employee newEmp);
        void deleteEmployee(long id);
        List<Employee> searchEmpByName(String empName);
        List<Employee> getAllEmp();
       Employee getEmpById(long id);

    void login(Employee employee);
}
