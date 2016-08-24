package nl.gridshore.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService service;

    @Autowired
    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @RequestMapping(method = GET)
    public List<Employee> employees(@RequestParam(defaultValue = "") String name) {
        return service.queryForEmployees(name);
    }

    @RequestMapping(method = POST)
    public Employee createEmployee(@RequestBody Employee employee) {
        String id = service.createEmployee(employee);
        employee.setId(id);
        return employee;
    }
}
