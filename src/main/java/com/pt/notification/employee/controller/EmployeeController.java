package com.pt.notification.employee.controller;

import com.pt.notification.employee.entity.Employee;
import com.pt.notification.employee.service.EmployeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(
    		@PathVariable("id") Long id) {

        return service.getEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee createEmployee(
            @RequestBody Employee employee) {

        return service.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(
    		@PathVariable("id") Long id,
            @RequestBody Employee employee) {

        return service.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(
    		@PathVariable("id") Long id) {

        service.deleteEmployee(id);

        return ResponseEntity.noContent().build();
    }
}