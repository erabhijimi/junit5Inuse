package com.cosmos.java8.comparator;

import com.cosmos.java8.pojo.Address;
import com.cosmos.java8.pojo.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        Address address = Address.builder()
                .addressId(1l)
                .line("L-2-56")
                .city("Angul")
                .state("Odisha")
                .pincode(759122)
                .build();
        Address address2 = Address.builder()
                .addressId(2l)
                .line("Hatisalapada")
                .city("Angul")
                .state("Odisha")
                .pincode(759122)
                .build();
        Address address3 = Address.builder()
                .addressId(3l)
                .line("College Square")
                .city("Bhubaneswar")
                .state("Odisha")
                .pincode(759130)
                .build();
        Address address4 = Address.builder()
                .addressId(4l)
                .line("Gandhi chaka")
                .city("Baleswar")
                .state("Odisha")
                .pincode(759137)
                .build();
        Employee employee = Employee.builder()
                .empid(1000L)
                .firstName("Abhijit")
                .lastName("Mishra")
                .jdate(LocalDate.of(2016,5,31))
                .empSal(50000)
                .address(address)
                .build();
        Employee employee1 = Employee.builder()
                .empid(1001L)
                .firstName("Pragnya")
                .lastName("Mishra")
                .jdate(LocalDate.of(2020,9,12))
                .empSal(5000)
                .address(address)
                .build();
        Employee employee2 = Employee.builder()
                .empid(1002L)
                .firstName("Biswajit")
                .lastName("Mishra")
                .jdate(LocalDate.of(2018,11,21))
                .empSal(10000)
                .address(address)
                .build();
        Employee employee3 = Employee.builder()
                .empid(1003L)
                .firstName("Lipu")
                .lastName("Mishra")
                .jdate(LocalDate.of(2021,2,3))
                .empSal(3000)
                .address(address2)
                .build();
        Employee employee4 = Employee.builder()
                .empid(1004L)
                .firstName("Priya")
                .lastName("Panda")
                .jdate(LocalDate.of(2017,2,27))
                .empSal(80000)
                .address(address3)
                .build();
        Employee employee5 = Employee.builder()
                .empid(1005L)
                .firstName("Jatin")
                .jdate(LocalDate.of(2018,7,16))
                .empSal(60000)
                .build();
        Employee employee6 = Employee.builder()
                .empid(1006L)
                .firstName("Priti")
                .lastName("Behera")
                .jdate(LocalDate.of(2017,3,1))
                .empSal(40000)
                .address(address4)
                .build();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        return employeeList;

    }

}
