package com.cosmos.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Long empid;
    private String firstName;
    private String lastName;
    private LocalDate jdate;
    private int empSal;
    private List<Address> addresses;

}
