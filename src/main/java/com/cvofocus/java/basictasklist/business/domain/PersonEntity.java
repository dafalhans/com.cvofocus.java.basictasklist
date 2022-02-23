package com.cvofocus.java.basictasklist.business.domain;


import lombok.Data;

@Data
public class PersonEntity {

    private String firstName;
    private String lastName;
    private AddressEntity address;
}
