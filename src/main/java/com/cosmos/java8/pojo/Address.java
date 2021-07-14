package com.cosmos.java8.pojo;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Address {
    private Long addressId;
    private String line;
    private String city;
    private String state;
    private long pincode;
}
