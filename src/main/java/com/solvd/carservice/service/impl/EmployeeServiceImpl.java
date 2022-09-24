package com.solvd.carservice.service.impl;

import com.solvd.carservice.domain.employee.Child;
import com.solvd.carservice.domain.employee.Employee;
import com.solvd.carservice.persistence.EmployeeRepository;
import com.solvd.carservice.persistence.impl.EmployeeRepositoryImpl;
import com.solvd.carservice.service.ChildService;
import com.solvd.carservice.service.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final ChildService childService;

    public EmployeeServiceImpl() {
        this.employeeRepository = new EmployeeRepositoryImpl();
        this.childService = new ChildServiceImpl();
    }

    @Override
    public Employee create(Employee employee, Long departmentId) {
        employee.setId(null);
        employeeRepository.create(employee);

        if (employee.getChildren() != null) {
            List<Child> children = employee.getChildren().stream()
                    .map(child -> childService.create(child, employee.getId()))
                    .collect(Collectors.toList());
            employee.setChildren(children);
        }
        return employee;
    }
}
