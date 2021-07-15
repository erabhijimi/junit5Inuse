package com.cosmos.java8.comparator;

import com.cosmos.java8.pojo.Employee;

import java.util.Comparator;
import java.util.List;

class MyDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getJdate().compareTo(o2.getJdate());
    }
}
public class MyComparator {
    private static EmployeeDao employeeDao = new EmployeeDao();
    public void sortByDate(){
        List<Employee> employeeList =employeeDao.getAllEmployees();
        employeeList.sort(new MyDateComparator());
        employeeList.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        myComparator.sortByDate();
        System.out.println("======================================================================");
        //The same can be done in Java 8 by
        employeeDao.getAllEmployees().stream()
                .sorted(Comparator.comparing(Employee::getJdate))
                .forEach(System.out::println);
    }
}
