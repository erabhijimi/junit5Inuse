package com.cosmos.java8;

import com.cosmos.java8.pojo.Address;
import com.cosmos.java8.pojo.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListEmpUtility {
    public List<Employee> getAllEmployees(){
        Address address1=Address.builder()
                .addressId(1L)
                .city("Angul")
                .pincode(759122L)
                .state("Odisha")
                .line("L-2-56")
                .build();
        Employee employee2 = Employee.builder()
                .empid(2L)
                .firstName("Biswajit")
                .lastName("Mishra")
                .empSal(7000)
                .jdate(LocalDate.of(2020,7,12))
                .address(address1)
                .build();
        Employee employee1 = Employee.builder()
                .empid(1L)
                .firstName("Abhijit")
                .lastName("Mishra")
                .empSal(53000)
                .jdate(LocalDate.of(2016,5,31))
                .address(address1)
                .build();
        Employee employee3 = Employee.builder()
                .empid(3L)
                .firstName("Pragnya")
                .lastName("Mishra")
                .empSal(3000)
                .jdate(LocalDate.of(2011,2,14))
                .address(address1)
                .build();
        List<Employee> employees = new ArrayList<Employee>(){{
            add(employee1);
            add(employee2);
            add(employee3);
        }};
        return employees;
    }
}
