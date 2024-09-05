package controllers;

import com.example.entities.Employee;
import com.example.model.EmployeeObj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")

public class Empcontroller {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Long> addEmployee(@RequestBody EmployeeObj employeeObj){

        log.info(" Receiving Employee Details");
        Long id = EmployeeService.addEmployee(employeeObj);

        log.info("Employee is created with EmployeeId : {} ",id );
        return new ResponseEntity<>(id, HttpStatus.OK);

    }
    @GetMapping("/getAll")
    public ResponseEntity<List<EmployeeObj>> getAllEmployees(){

        log.info(" Fetching Employee Details ");
        List<EmployeeObj> allEmployees = employeeService.getAllEmployees();

        log.info("All Employees Data is Fetched " );
        return  new ResponseEntity<>(allEmployees, HttpStatus.OK);


    }

    @GetMapping("/get/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Long id){

        log.info(" Fetching One Employee Details ");
        EmployeeDTO employee = employeeService.getEmployee(id);

        log.info("Employee Data is Fetched " );
        return  new ResponseEntity<>(employee, HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeObj> updateEmployee(@RequestBody EmployeeObj employeeObj,@PathVariable("id") Long id){

        log.info(" Updating Employee Details");
        EmployeeObj employee = employeeService.updateEmployee(employeeObj,id);

        log.info("Employee is updated of  EmployeeId : {} ",id );
        return new ResponseEntity<>(employee, HttpStatus.OK);

    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){

        log.info(" Deleting Employee details of id : {} ",id);
        String deletedEmployee = employeeService.deleteEmployee(id);
        log.info("Employee data is deleted " );
        return  new ResponseEntity<>(deletedEmployee, HttpStatus.OK);

    }





}