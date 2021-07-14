package com.cosmos.java8.pojo;

import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {
    private Long empid;
    private String firstName;
    private String lastName;
    private LocalDate jdate;
    private int empSal;
    private Address address;

}
