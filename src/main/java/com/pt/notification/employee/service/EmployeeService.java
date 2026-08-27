package com.pt.notification.employee.service;

import com.pt.notification.employee.entity.Employee;
import com.pt.notification.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);
    }

    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    public Employee updateEmployee(Long id, Employee employee) {

        Employee existing = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found"));

        existing.setName(employee.getName());
        existing.setDepartment(employee.getDepartment());
        existing.setSalary(employee.getSalary());

        return repository.save(existing);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}