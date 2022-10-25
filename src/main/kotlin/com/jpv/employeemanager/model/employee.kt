package com.jpv.employeemanager.model

import kotlinx.serialization.Serializable
import javax.persistence.*

@Entity
@Serializable
class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    var id: Long? = 0
    var name: String? = null
        get() = field
        set(value) {
            field = value
        }
    var email: String? = null
        get() = field
        set(value) {
            field = value
        }
    var jobTitle: String? = null
        get() = field
        set(value) {
            field = value
        }
    var phone: String? = null
        get() = field
        set(value) {
            field = value
        }
    var imageUrl: String? = null
        get() = field
        set(value) {
            field = value
        }

    @Column(nullable = false, updatable = false)
    var employeeCode: String = ""
        get() = field
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Employee{"+
                "id=" + id +
                ", name = " + name +
                ", email = " + email +
                ", jobTitle = " + jobTitle +
                ", phone = " + phone +
                ", imageUrl = " + imageUrl
    }
}
