package com.jpv.employeemanager.service

import com.jpv.employeemanager.model.Employee
import com.jpv.employeemanager.repo.EmployeeRepo
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeService(private var employeeRepo: EmployeeRepo) {

    fun addEmployee(employee: Employee) : Employee {
        employee.employeeCode = UUID.randomUUID().toString()
        return employeeRepo.save(employee)
    }

    fun findAllEmployees(): MutableList<Employee> {
        return employeeRepo.findAll()
    }
    fun updateEmployee(employee: Employee): Employee {
        return employeeRepo.save(employee)
    }

    fun findEmployeeById(id: Long) : Employee? {
        return employeeRepo.findEmployeeById(id) ?: throw IllegalArgumentException("Invalid employee id number")
    }

    fun deleteEmploytee(id: Long) {
        employeeRepo.deleteEmployeeById(id)
    }
}
