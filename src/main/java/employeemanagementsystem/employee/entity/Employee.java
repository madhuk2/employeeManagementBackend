package employeemanagementsystem.employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    public  Employee()
    {

    }
    public Employee(long id, String empName, long phoneNo, String address, String exp, String role, String email, String image) {

        this.id = id;
        this.empName = empName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.exp = exp;
        this.role = role;
        this.email = email;
        this.image = image;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String empName;
    private long phoneNo;
    private  String address;
    private String exp;
    private  String role;
    private String email;
    private String image;



    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
