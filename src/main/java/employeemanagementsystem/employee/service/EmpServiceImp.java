package employeemanagementsystem.employee.service;

import employeemanagementsystem.employee.entity.Employee;
import employeemanagementsystem.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmpServiceImp implements EmployeeService{
@Autowired
    EmployeeRepository employeeRepository;

    @Override
    public void addOrUpdateEmployee(Employee newEmp) {
        employeeRepository.save(newEmp);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> searchEmpByName(String empName) {
//for finding any data from database using a certain parameter we use  find
          List<Employee>employees=employeeRepository.findAllByEmpName(empName);
        return employees;
    }

    @Override
    public List<Employee> getAllEmp() {
        List<Employee>employees=employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee getEmpById(long id){


    Employee employee=employeeRepository.findById(id).get();
        return employee;
    }

    @Override
    public void login(Employee employee) {
        String email=employee.getEmail();
        long  phoneNo=employee.getPhoneNo();
        Employee curr=employeeRepository.findByEmail(email);
        if(curr==null)
        {
            System.out.println("user not found");
        }
        if(curr.getPhoneNo()==phoneNo)
        {
            System.out.println("succesfully logged in");
        }
    }
}
