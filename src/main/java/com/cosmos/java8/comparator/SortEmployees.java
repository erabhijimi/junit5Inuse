package com.cosmos.java8.comparator;

import com.cosmos.java8.pojo.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortEmployees {

    private EmployeeDao employeeDao = new EmployeeDao();
    public void sortEmployeesByFirstName(){
        List employeeList =employeeDao.getAllEmployees();
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .forEach(System.out::println);
    }
    public void sortEmployeesByLastName(){
        List employeeList =employeeDao.getAllEmployees();
        employeeList.stream()
                .sorted(Comparator.comparing(Employee::getLastName,Comparator.nullsFirst(String::compareTo)))
                .forEach(System.out::println);
                //.collect(Collectors.toMap(Employee::getFirstName, Function.identity()));
        //map.entrySet().forEach((k)->System.out.println(k.getKey()+" "+k.getValue()));
    }
    public void collectListAsMap(){
        List employeeList =employeeDao.getAllEmployees();
        Map<String,Employee> map= (Map<String, Employee>)employeeList.stream()
                .collect(Collectors.toMap(Employee::getEmpid,Function.identity()));
        map.entrySet().stream()
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        SortEmployees sortEmployees = new SortEmployees();
        sortEmployees.sortEmployeesByFirstName();
        System.out.println("=====================================================================");
        sortEmployees.sortEmployeesByLastName();
        System.out.println("=====================================================================");
        sortEmployees.collectListAsMap();
    }
}
