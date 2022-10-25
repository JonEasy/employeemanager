package com.jpv.employeemanager.repo

import com.jpv.employeemanager.model.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepo: JpaRepository<Employee, Long> {
    fun deleteEmployeeById(id: Long)
    fun findEmployeeById(id: Long): Employee?

}
