package com.cosmos.java8;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private Long addressId;
    private String line;
    private String city;
    private String state;
    private long pincode;
}
