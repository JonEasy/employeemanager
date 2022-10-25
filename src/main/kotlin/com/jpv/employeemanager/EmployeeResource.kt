package com.jpv.employeemanager

import com.jpv.employeemanager.model.Employee
import com.jpv.employeemanager.service.EmployeeService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/employee")
class EmployeeResource(private val employeeService: EmployeeService) {

    @GetMapping("/all")
    fun getAllEmployees(): ResponseEntity<List<Employee>> {
        val employees = employeeService.findAllEmployees()
        return ResponseEntity(employees, HttpStatus.OK)
    }
    @GetMapping("find/{id}")
    fun getEmployeeById(@PathVariable("id") id: Long): ResponseEntity<Employee> {
        val employee = employeeService.findEmployeeById(id)
        return ResponseEntity(employee, HttpStatus.OK)
    }

    @PostMapping("/add")
    fun addEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val newEmployee = employeeService.addEmployee(employee)
        return ResponseEntity(newEmployee, HttpStatus.CREATED)
    }

    @PutMapping("/update")
    fun updateEmployee(@RequestBody employee: Employee): ResponseEntity<Employee> {
        val updateEmployee = employeeService.updateEmployee(employee)
        return ResponseEntity(updateEmployee, HttpStatus.OK)
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    fun updateEmployee(@PathVariable("id") id: Long): ResponseEntity<HttpStatus> {
        employeeService.deleteEmploytee(id)
        return ResponseEntity(HttpStatus.OK)
    }


}
