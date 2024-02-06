package employeemanagementsystem.employee.controller;

import employeemanagementsystem.employee.entity.Employee;
import employeemanagementsystem.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("employees")
public class EmployeeController{
    @Autowired
    EmployeeService employeeService;
    @PostMapping("addOrUpdate")
    public void addOrUpdateEmployee(@RequestBody Employee newEmp) {
       employeeService.addOrUpdateEmployee(newEmp);
    }
    @PostMapping("login")
    public void login(@RequestBody Employee employee)
    {
        employeeService.login(employee);
    }
    @DeleteMapping("delete/{id}")
    public void deleteEmployee(@PathVariable  long id) {
       employeeService.deleteEmployee(id);
    }
    @GetMapping("searchByName/{empName}")
    public List<Employee> searchEmpByName(@PathVariable String empName) {

        return employeeService.searchEmpByName(empName);
    }
    @GetMapping("")
    public List<Employee> getAllEmp() {

        return employeeService.getAllEmp();
    }
    @GetMapping ("{id}/Employee")
    public Employee getEmpById(@PathVariable long id){



        return employeeService.getEmpById(id);
    }


}
